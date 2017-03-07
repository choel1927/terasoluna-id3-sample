/* 
 * @(#)TriAppHelper.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app;

import org.springframework.stereotype.Component;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.BeanWrapper;
import org.dozer.Mapper;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.reflect.Array;

/**
 * This class supports a convert processing for Controller class processing method. 
 */
@Component
public class TriAppHelper {

	@Inject
	Mapper beanMapper;

	/**
	 * Copy(Map) a value recursively from the source Bean to the destination
	 * Bean to be converted.
	 * 
	 * @param source
	 *            Copy Source Object
	 * @param destinationClass
	 *            Copying Destination Bean Class
	 * @return Mapping Results
	 */
    @SuppressWarnings("unchecked")
    public <T> T map(Object source, Class<T> destinationClass) {
        if (source == null) {
            return null;
        } else if (destinationClass.isInstance(source)) {
            return (T) source;
        }
        return beanMapper.map(source, destinationClass);
    }

	/**
	 * Copy(Map) a value recursively from the source Bean to the destination
	 * Bean to be converted.
	 * 
	 * @param source
	 *            Copy Source Object
	 * @param destination
	 *            Copying Destination Bean Object
	 */
	public void map(Object source, Object destination) {
		beanMapper.map(source, destination);
	}

	/**
	 * Copy(Map) a value recursively from the source Bean to the destination
	 * Bean to be converted.
	 * 
	 * @param source
	 *            Copy Source Collection
	 * @param destinationElementClass
	 *            Copying Destination Bean Class
	 * @return Mapping Results
	 */
    public <S, T> List<T> mapListToList(List<S> source,
            Class<T> destinationElementClass) {
        if (source == null) {
            return null;
        }
        List<T> destination = new ArrayList<T>();
        for (S sourceElement : source) {
            destination.add(map(sourceElement, destinationElementClass));
        }
        return destination;
    }

	/**
	 * Copy(Map) a value recursively from the source Bean to the destination
	 * Bean to be converted.
	 * 
	 * @param source
	 *            Copy Source Object Array
	 * @param destinationElementClass
	 *            Copying Destination Bean Class
	 * @return Mapping Results
	 */
	public <S, T> List<T> mapArrayToList(S[] source,
			Class<T> destinationElementClass) {
		if (source == null) {
			return null;
		}
		return mapListToList(Arrays.asList(source), destinationElementClass);
	}

	/**
	 * Copy(Map) a value recursively from the source Bean to the destination
	 * Bean to be converted.
	 * 
	 * @param source
	 *            Copy Source Collection
	 * @param destinationElementClass
	 *            Copying Destination Bean Class
	 * @return Mapping Results
	 */
    public <S, T> T[] mapListToArray(List<S> source,
            Class<T> destinationElementClass) {
        if (source == null) {
            return null;
        }
        @SuppressWarnings("unchecked")
        T[] destination = (T[]) Array.newInstance(destinationElementClass,
                source.size());
        int index = 0;
        for (S sourceElement : source) {
            destination[index++] = map(sourceElement, destinationElementClass);
        }
        return destination;
    }

	/**
	 * Copy(Map) a value recursively from the source Bean to the destination
	 * Bean to be converted.
	 * 
	 * @param source
	 *            Copy Source Object Array
	 * @param destinationElementClass
	 *            Copying Destination Bean Class
	 * @return Mapping Results
	 */
	public <S, T> T[] mapArrayToArray(S[] source,
			Class<T> destinationElementClass) {
		if (source == null) {
			return null;
		}
		return mapListToArray(Arrays.asList(source), destinationElementClass);
	}

	/**
	 * Conver to the Map corresponding to the Dynamic Code List, based on the
	 * collection obtained by a scope.
	 * 
	 * @param list
	 *            Collection obtained by a scope
	 * @param keyPropertyName
	 *            Attribute Name of Map Key
	 * @param valuePropertyName
	 *            Attribute Name of Map Value
	 * @return Converted Map
	 */
	public Map<Object, Object> convertBeanListToMap(List<?> list,
			String keyPropertyName, String valuePropertyName) {
		if (list == null || list.isEmpty()) {
			return Collections.emptyMap();
		}
		Map<Object, Object> result = new LinkedHashMap<Object, Object>();
		for (Object element : list) {
			BeanWrapper beanWrapper = PropertyAccessorFactory
					.forBeanPropertyAccess(element);
			result.put(beanWrapper.getPropertyValue(keyPropertyName),
					beanWrapper.getPropertyValue(valuePropertyName));
		}
		return result;
	}

	/**
	 * Conver to the Map corresponding to the Dynamic Code List, based on the
	 * collection obtained by a scope.
	 * 
	 * @param array
	 *            Array obtained by a scope
	 * @param keyPropertyName
	 *            Attribute Name of Map Key
	 * @param valuePropertyName
	 *            Attribute Name of Map Value
	 * @return Converted Map
	 */
	public Map<Object, Object> convertBeanArrayToMap(Object[] array,
			String keyPropertyName, String valuePropertyName) {
		if (array == null || array.length == 0) {
			return Collections.emptyMap();
		}
		return convertBeanListToMap(Arrays.asList(array), keyPropertyName,
				valuePropertyName);
	}
	
		private Map<String, String> contextToViewNameMap;

	/**
	 * ���ʉ�ʃt���[���̏I���m�[�h�ɓ��B�����ۂɑJ�ڂ���A�N�V�����p�X�i���A��j��ݒ肵�܂��B
	 * 
	 * @param context
	 *            �R���e�L�X�g
	 * @param viewName
	 *            ���A��View��
	 */
	public void setViewNameForContext(String context, String viewName) {
		if (contextToViewNameMap == null) {
			contextToViewNameMap = new HashMap<String, String>();
		}
		contextToViewNameMap.put(context, viewName);
	}

	/**
	 * ���ʉ�ʃt���[���̏I���m�[�h�ɓ��B�����ۂɑJ�ڂ���A�N�V�����p�X�i���A��j���擾���܂��B
	 * 
	 * @param context
	 *            �R���e�L�X�g
	 */
	public String getViewNameForContext(String context) {
		if (contextToViewNameMap == null) {
			return null;
		}
		return contextToViewNameMap.get(context);
	}
}