/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.opensocial.model.impl;

import com.liferay.opensocial.model.Gadget;
import com.liferay.opensocial.model.GadgetSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <a href="GadgetModelImpl.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This interface is a model that represents the OpenSocial_Gadget table in the
 * database.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       GadgetImpl
 * @see       com.liferay.opensocial.model.Gadget
 * @see       com.liferay.opensocial.model.GadgetModel
 * @generated
 */
public class GadgetModelImpl extends BaseModelImpl<Gadget> {
	public static final String TABLE_NAME = "OpenSocial_Gadget";
	public static final Object[][] TABLE_COLUMNS = {
			{ "gadgetId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "createDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "name", new Integer(Types.VARCHAR) },
			{ "url", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table OpenSocial_Gadget (gadgetId LONG not null primary key,companyId LONG,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,url STRING null)";
	public static final String TABLE_SQL_DROP = "drop table OpenSocial_Gadget";
	public static final String ORDER_BY_JPQL = " ORDER BY gadget.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY OpenSocial_Gadget.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.opensocial.model.Gadget"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.opensocial.model.Gadget"),
			true);

	public static Gadget toModel(GadgetSoap soapModel) {
		Gadget model = new GadgetImpl();

		model.setGadgetId(soapModel.getGadgetId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());
		model.setUrl(soapModel.getUrl());

		return model;
	}

	public static List<Gadget> toModels(GadgetSoap[] soapModels) {
		List<Gadget> models = new ArrayList<Gadget>(soapModels.length);

		for (GadgetSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.opensocial.model.Gadget"));

	public GadgetModelImpl() {
	}

	public long getPrimaryKey() {
		return _gadgetId;
	}

	public void setPrimaryKey(long pk) {
		setGadgetId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_gadgetId);
	}

	public long getGadgetId() {
		return _gadgetId;
	}

	public void setGadgetId(long gadgetId) {
		_gadgetId = gadgetId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	public String getUrl() {
		if (_url == null) {
			return StringPool.BLANK;
		}
		else {
			return _url;
		}
	}

	public void setUrl(String url) {
		_url = url;
	}

	public Gadget toEscapedModel() {
		if (isEscapedModel()) {
			return (Gadget)this;
		}
		else {
			return (Gadget)Proxy.newProxyInstance(Gadget.class.getClassLoader(),
				new Class[] { Gadget.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					Gadget.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		GadgetImpl clone = new GadgetImpl();

		clone.setGadgetId(getGadgetId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setName(getName());
		clone.setUrl(getUrl());

		return clone;
	}

	public int compareTo(Gadget gadget) {
		int value = 0;

		value = getName().compareTo(gadget.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Gadget gadget = null;

		try {
			gadget = (Gadget)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = gadget.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{gadgetId=");
		sb.append(getGadgetId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.opensocial.model.Gadget");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>gadgetId</column-name><column-value><![CDATA[");
		sb.append(getGadgetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _gadgetId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _url;
	private transient ExpandoBridge _expandoBridge;
}