/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.lms.service.base;

import com.liferay.lms.service.CourseLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class CourseLocalServiceClpInvoker {
	public CourseLocalServiceClpInvoker() {
		_methodName0 = "addCourse";

		_methodParameterTypes0 = new String[] { "com.liferay.lms.model.Course" };

		_methodName1 = "createCourse";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteCourse";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteCourse";

		_methodParameterTypes3 = new String[] { "com.liferay.lms.model.Course" };

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "fetchCourse";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getCourse";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getCourseByUuidAndGroupId";

		_methodParameterTypes12 = new String[] { "java.lang.String", "long" };

		_methodName13 = "getCourses";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getCoursesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateCourse";

		_methodParameterTypes15 = new String[] { "com.liferay.lms.model.Course" };

		_methodName16 = "updateCourse";

		_methodParameterTypes16 = new String[] {
				"com.liferay.lms.model.Course", "boolean"
			};

		_methodName209 = "getBeanIdentifier";

		_methodParameterTypes209 = new String[] {  };

		_methodName210 = "setBeanIdentifier";

		_methodParameterTypes210 = new String[] { "java.lang.String" };

		_methodName215 = "getCoursesOfGroup";

		_methodParameterTypes215 = new String[] { "long" };

		_methodName216 = "getOpenCoursesOfGroup";

		_methodParameterTypes216 = new String[] { "long" };

		_methodName217 = "getCourses";

		_methodParameterTypes217 = new String[] { "long" };

		_methodName218 = "countByGroupId";

		_methodParameterTypes218 = new String[] { "long" };

		_methodName219 = "fetchByGroupCreatedId";

		_methodParameterTypes219 = new String[] { "long" };

		_methodName220 = "addCourse";

		_methodParameterTypes220 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.util.Locale", "java.util.Date",
				"java.util.Date", "java.util.Date", "long", "int",
				"com.liferay.portal.service.ServiceContext", "long", "int",
				"boolean"
			};

		_methodName221 = "getUserCourses";

		_methodParameterTypes221 = new String[] { "long" };

		_methodName222 = "getOpenedUserCourses";

		_methodParameterTypes222 = new String[] { "long" };

		_methodName223 = "getOpenedUserCourses";

		_methodParameterTypes223 = new String[] { "long", "int", "int" };

		_methodName224 = "getPublicCoursesByCompanyId";

		_methodParameterTypes224 = new String[] { "java.lang.Long" };

		_methodName225 = "getPublicCoursesByCompanyId";

		_methodParameterTypes225 = new String[] { "java.lang.Long", "int", "int" };

		_methodName226 = "addCourse";

		_methodParameterTypes226 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.util.Locale", "java.util.Date",
				"java.util.Date", "java.util.Date", "long", "int", "long",
				"long", "int", "com.liferay.portal.service.ServiceContext",
				"boolean"
			};

		_methodName227 = "addCourse";

		_methodParameterTypes227 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.util.Locale", "java.util.Date",
				"java.util.Date", "java.util.Date",
				"com.liferay.portal.service.ServiceContext", "long"
			};

		_methodName228 = "addCourse";

		_methodParameterTypes228 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.util.Locale", "java.util.Date", "java.util.Date",
				"java.util.Date", "com.liferay.portal.service.ServiceContext",
				"long"
			};

		_methodName233 = "setVisible";

		_methodParameterTypes233 = new String[] { "long", "boolean" };

		_methodName234 = "modCourse";

		_methodParameterTypes234 = new String[] {
				"com.liferay.lms.model.Course", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName235 = "modCourse";

		_methodParameterTypes235 = new String[] {
				"com.liferay.lms.model.Course",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName236 = "modCourse";

		_methodParameterTypes236 = new String[] {
				"com.liferay.lms.model.Course", "java.lang.String",
				"com.liferay.portal.service.ServiceContext", "boolean"
			};

		_methodName237 = "closeCourse";

		_methodParameterTypes237 = new String[] { "long" };

		_methodName238 = "openCourse";

		_methodParameterTypes238 = new String[] { "long" };

		_methodName239 = "deleteCourse";

		_methodParameterTypes239 = new String[] { "com.liferay.lms.model.Course" };

		_methodName240 = "deleteCourse";

		_methodParameterTypes240 = new String[] { "long" };

		_methodName241 = "existsCourseName";

		_methodParameterTypes241 = new String[] {
				"long", "long", "long", "java.lang.String"
			};

		_methodName242 = "getCourseByGroupCreatedId";

		_methodParameterTypes242 = new String[] { "long" };

		_methodName243 = "existsCourseName";

		_methodParameterTypes243 = new String[] {
				"java.lang.Long", "java.lang.Long", "java.lang.String"
			};

		_methodName244 = "findByCompanyId";

		_methodParameterTypes244 = new String[] { "java.lang.Long" };

		_methodName245 = "getStudentsFromCourseCount";

		_methodParameterTypes245 = new String[] { "long" };

		_methodName246 = "getStudentsFromCourseCount";

		_methodParameterTypes246 = new String[] { "long", "long" };

		_methodName247 = "getStudentsFromCourseCount";

		_methodParameterTypes247 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "boolean"
			};

		_methodName248 = "getStudentsFromCourse";

		_methodParameterTypes248 = new String[] { "com.liferay.lms.model.Course" };

		_methodName249 = "getStudentsFromCourse";

		_methodParameterTypes249 = new String[] { "long", "long" };

		_methodName250 = "getStudentsFromCourse";

		_methodParameterTypes250 = new String[] { "long", "long", "long" };

		_methodName251 = "getStudentsFromCourse";

		_methodParameterTypes251 = new String[] {
				"long", "long", "int", "int", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"boolean"
			};

		_methodName253 = "getTeachersFromCourse";

		_methodParameterTypes253 = new String[] { "long" };

		_methodName254 = "getTeachersAndEditorsIdsFromCourse";

		_methodParameterTypes254 = new String[] { "com.liferay.lms.model.Course" };

		_methodName255 = "getByTitleStatusCategoriesTags";

		_methodParameterTypes255 = new String[] {
				"java.lang.String", "int", "long[][]", "long[][]", "long",
				"long", "long", "java.lang.String", "boolean", "boolean", "int",
				"int"
			};

		_methodName256 = "countByTitleStatusCategoriesTags";

		_methodParameterTypes256 = new String[] {
				"java.lang.String", "int", "long[][]", "long[][]", "long",
				"long", "long", "java.lang.String", "boolean", "boolean"
			};

		_methodName257 = "getStudents";

		_methodParameterTypes257 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "boolean", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName258 = "countStudents";

		_methodParameterTypes258 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "boolean"
			};

		_methodName259 = "countStudentsStatus";

		_methodParameterTypes259 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "int", "boolean"
			};

		_methodName260 = "getCoursesCatalogByTitleCategoriesTags";

		_methodParameterTypes260 = new String[] {
				"java.lang.String", "long[][]", "long[][]", "long", "long",
				"long", "java.lang.String", "int", "int"
			};

		_methodName261 = "countCoursesCatalogByTitleCategoriesTags";

		_methodParameterTypes261 = new String[] {
				"java.lang.String", "long[][]", "long[][]", "long", "long",
				"long", "java.lang.String"
			};

		_methodName262 = "getCatalogCoursesAssetTags";

		_methodParameterTypes262 = new String[] {
				"java.lang.String", "long[][]", "long", "long", "long",
				"java.lang.String"
			};

		_methodName263 = "countCategoryCourses";

		_methodParameterTypes263 = new String[] {
				"java.lang.String", "long[][]", "long[][]", "long", "long",
				"long", "java.lang.String"
			};

		_methodName264 = "countTagCourses";

		_methodParameterTypes264 = new String[] {
				"java.lang.String", "long[][]", "long[][]", "long", "long",
				"long", "java.lang.String"
			};

		_methodName265 = "getMyCourses";

		_methodParameterTypes265 = new String[] {
				"long", "long", "com.liferay.portal.theme.ThemeDisplay",
				"java.lang.String", "java.lang.String", "int", "int"
			};

		_methodName266 = "countMyCourses";

		_methodParameterTypes266 = new String[] {
				"long", "long", "com.liferay.portal.theme.ThemeDisplay"
			};

		_methodName267 = "hasUserTries";

		_methodParameterTypes267 = new String[] { "long", "long" };

		_methodName268 = "getPublicCoursesByCompanyId";

		_methodParameterTypes268 = new String[] { "java.lang.Long", "int" };

		_methodName269 = "getChildCourses";

		_methodParameterTypes269 = new String[] { "long" };

		_methodName270 = "getCoursesParents";

		_methodParameterTypes270 = new String[] { "long" };

		_methodName271 = "addStudentToCourseWithDates";

		_methodParameterTypes271 = new String[] {
				"long", "long", "java.util.Date", "java.util.Date"
			};

		_methodName272 = "editUserInscriptionDates";

		_methodParameterTypes272 = new String[] {
				"long", "long", "java.util.Date", "java.util.Date"
			};

		_methodName273 = "isLocked";

		_methodParameterTypes273 = new String[] {
				"com.liferay.lms.model.Course", "com.liferay.portal.model.User"
			};

		_methodName274 = "canAccessLock";

		_methodParameterTypes274 = new String[] {
				"long", "com.liferay.portal.model.User"
			};

		_methodName275 = "getLastModuleDateInCourse";

		_methodParameterTypes275 = new String[] { "long" };

		_methodName276 = "getFirstModuleDateInCourse";

		_methodParameterTypes276 = new String[] { "long" };

		_methodName277 = "getImageURL";

		_methodParameterTypes277 = new String[] {
				"com.liferay.lms.model.Course",
				"com.liferay.portal.theme.ThemeDisplay"
			};

		_methodName278 = "addStudentToCourseByUserId";

		_methodParameterTypes278 = new String[] {
				"long", "long", "long",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return CourseLocalServiceUtil.addCourse((com.liferay.lms.model.Course)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return CourseLocalServiceUtil.createCourse(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return CourseLocalServiceUtil.deleteCourse(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return CourseLocalServiceUtil.deleteCourse((com.liferay.lms.model.Course)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return CourseLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return CourseLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return CourseLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return CourseLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return CourseLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return CourseLocalServiceUtil.fetchCourse(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return CourseLocalServiceUtil.getCourse(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return CourseLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return CourseLocalServiceUtil.getCourseByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return CourseLocalServiceUtil.getCourses(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return CourseLocalServiceUtil.getCoursesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return CourseLocalServiceUtil.updateCourse((com.liferay.lms.model.Course)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			return CourseLocalServiceUtil.updateCourse((com.liferay.lms.model.Course)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName209.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes209, parameterTypes)) {
			return CourseLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName210.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes210, parameterTypes)) {
			CourseLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName215.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes215, parameterTypes)) {
			return CourseLocalServiceUtil.getCoursesOfGroup(((Long)arguments[0]).longValue());
		}

		if (_methodName216.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes216, parameterTypes)) {
			return CourseLocalServiceUtil.getOpenCoursesOfGroup(((Long)arguments[0]).longValue());
		}

		if (_methodName217.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes217, parameterTypes)) {
			return CourseLocalServiceUtil.getCourses(((Long)arguments[0]).longValue());
		}

		if (_methodName218.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes218, parameterTypes)) {
			return CourseLocalServiceUtil.countByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName219.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes219, parameterTypes)) {
			return CourseLocalServiceUtil.fetchByGroupCreatedId(((Long)arguments[0]).longValue());
		}

		if (_methodName220.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes220, parameterTypes)) {
			return CourseLocalServiceUtil.addCourse((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.util.Locale)arguments[4],
				(java.util.Date)arguments[5], (java.util.Date)arguments[6],
				(java.util.Date)arguments[7], ((Long)arguments[8]).longValue(),
				((Integer)arguments[9]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[10],
				((Long)arguments[11]).longValue(),
				((Integer)arguments[12]).intValue(),
				((Boolean)arguments[13]).booleanValue());
		}

		if (_methodName221.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes221, parameterTypes)) {
			return CourseLocalServiceUtil.getUserCourses(((Long)arguments[0]).longValue());
		}

		if (_methodName222.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes222, parameterTypes)) {
			return CourseLocalServiceUtil.getOpenedUserCourses(((Long)arguments[0]).longValue());
		}

		if (_methodName223.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes223, parameterTypes)) {
			return CourseLocalServiceUtil.getOpenedUserCourses(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName224.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes224, parameterTypes)) {
			return CourseLocalServiceUtil.getPublicCoursesByCompanyId((java.lang.Long)arguments[0]);
		}

		if (_methodName225.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes225, parameterTypes)) {
			return CourseLocalServiceUtil.getPublicCoursesByCompanyId((java.lang.Long)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName226.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes226, parameterTypes)) {
			return CourseLocalServiceUtil.addCourse((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.util.Locale)arguments[4],
				(java.util.Date)arguments[5], (java.util.Date)arguments[6],
				(java.util.Date)arguments[7], ((Long)arguments[8]).longValue(),
				((Integer)arguments[9]).intValue(),
				((Long)arguments[10]).longValue(),
				((Long)arguments[11]).longValue(),
				((Integer)arguments[12]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[13],
				((Boolean)arguments[14]).booleanValue());
		}

		if (_methodName227.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes227, parameterTypes)) {
			return CourseLocalServiceUtil.addCourse((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.util.Locale)arguments[4],
				(java.util.Date)arguments[5], (java.util.Date)arguments[6],
				(java.util.Date)arguments[7],
				(com.liferay.portal.service.ServiceContext)arguments[8],
				((Long)arguments[9]).longValue());
		}

		if (_methodName228.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes228, parameterTypes)) {
			return CourseLocalServiceUtil.addCourse((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.util.Locale)arguments[3], (java.util.Date)arguments[4],
				(java.util.Date)arguments[5], (java.util.Date)arguments[6],
				(com.liferay.portal.service.ServiceContext)arguments[7],
				((Long)arguments[8]).longValue());
		}

		if (_methodName233.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes233, parameterTypes)) {
			CourseLocalServiceUtil.setVisible(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName234.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes234, parameterTypes)) {
			return CourseLocalServiceUtil.modCourse((com.liferay.lms.model.Course)arguments[0],
				(java.lang.String)arguments[1],
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName235.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes235, parameterTypes)) {
			return CourseLocalServiceUtil.modCourse((com.liferay.lms.model.Course)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName236.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes236, parameterTypes)) {
			return CourseLocalServiceUtil.modCourse((com.liferay.lms.model.Course)arguments[0],
				(java.lang.String)arguments[1],
				(com.liferay.portal.service.ServiceContext)arguments[2],
				((Boolean)arguments[3]).booleanValue());
		}

		if (_methodName237.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes237, parameterTypes)) {
			return CourseLocalServiceUtil.closeCourse(((Long)arguments[0]).longValue());
		}

		if (_methodName238.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes238, parameterTypes)) {
			return CourseLocalServiceUtil.openCourse(((Long)arguments[0]).longValue());
		}

		if (_methodName239.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes239, parameterTypes)) {
			return CourseLocalServiceUtil.deleteCourse((com.liferay.lms.model.Course)arguments[0]);
		}

		if (_methodName240.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes240, parameterTypes)) {
			return CourseLocalServiceUtil.deleteCourse(((Long)arguments[0]).longValue());
		}

		if (_methodName241.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes241, parameterTypes)) {
			return CourseLocalServiceUtil.existsCourseName(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(), (java.lang.String)arguments[3]);
		}

		if (_methodName242.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes242, parameterTypes)) {
			return CourseLocalServiceUtil.getCourseByGroupCreatedId(((Long)arguments[0]).longValue());
		}

		if (_methodName243.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes243, parameterTypes)) {
			return CourseLocalServiceUtil.existsCourseName((java.lang.Long)arguments[0],
				(java.lang.Long)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName244.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes244, parameterTypes)) {
			return CourseLocalServiceUtil.findByCompanyId((java.lang.Long)arguments[0]);
		}

		if (_methodName245.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes245, parameterTypes)) {
			return CourseLocalServiceUtil.getStudentsFromCourseCount(((Long)arguments[0]).longValue());
		}

		if (_methodName246.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes246, parameterTypes)) {
			return CourseLocalServiceUtil.getStudentsFromCourseCount(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName247.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes247, parameterTypes)) {
			return CourseLocalServiceUtil.getStudentsFromCourseCount(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				((Boolean)arguments[6]).booleanValue());
		}

		if (_methodName248.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes248, parameterTypes)) {
			return CourseLocalServiceUtil.getStudentsFromCourse((com.liferay.lms.model.Course)arguments[0]);
		}

		if (_methodName249.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes249, parameterTypes)) {
			return CourseLocalServiceUtil.getStudentsFromCourse(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName250.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes250, parameterTypes)) {
			return CourseLocalServiceUtil.getStudentsFromCourse(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName251.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes251, parameterTypes)) {
			return CourseLocalServiceUtil.getStudentsFromCourse(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				((Boolean)arguments[9]).booleanValue());
		}

		if (_methodName253.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes253, parameterTypes)) {
			return CourseLocalServiceUtil.getTeachersFromCourse(((Long)arguments[0]).longValue());
		}

		if (_methodName254.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes254, parameterTypes)) {
			return CourseLocalServiceUtil.getTeachersAndEditorsIdsFromCourse((com.liferay.lms.model.Course)arguments[0]);
		}

		if (_methodName255.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes255, parameterTypes)) {
			return CourseLocalServiceUtil.getByTitleStatusCategoriesTags((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(), (long[])arguments[2],
				(long[])arguments[3], ((Long)arguments[4]).longValue(),
				((Long)arguments[5]).longValue(),
				((Long)arguments[6]).longValue(),
				(java.lang.String)arguments[7],
				((Boolean)arguments[8]).booleanValue(),
				((Boolean)arguments[9]).booleanValue(),
				((Integer)arguments[10]).intValue(),
				((Integer)arguments[11]).intValue());
		}

		if (_methodName256.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes256, parameterTypes)) {
			return CourseLocalServiceUtil.countByTitleStatusCategoriesTags((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(), (long[])arguments[2],
				(long[])arguments[3], ((Long)arguments[4]).longValue(),
				((Long)arguments[5]).longValue(),
				((Long)arguments[6]).longValue(),
				(java.lang.String)arguments[7],
				((Boolean)arguments[8]).booleanValue(),
				((Boolean)arguments[9]).booleanValue());
		}

		if (_methodName257.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes257, parameterTypes)) {
			return CourseLocalServiceUtil.getStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				((Boolean)arguments[6]).booleanValue(),
				((Integer)arguments[7]).intValue(),
				((Integer)arguments[8]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[9]);
		}

		if (_methodName258.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes258, parameterTypes)) {
			return CourseLocalServiceUtil.countStudents(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				((Boolean)arguments[6]).booleanValue());
		}

		if (_methodName259.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes259, parameterTypes)) {
			return CourseLocalServiceUtil.countStudentsStatus(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				((Integer)arguments[6]).intValue(),
				((Boolean)arguments[7]).booleanValue());
		}

		if (_methodName260.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes260, parameterTypes)) {
			return CourseLocalServiceUtil.getCoursesCatalogByTitleCategoriesTags((java.lang.String)arguments[0],
				(long[])arguments[1], (long[])arguments[2],
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(),
				((Long)arguments[5]).longValue(),
				(java.lang.String)arguments[6],
				((Integer)arguments[7]).intValue(),
				((Integer)arguments[8]).intValue());
		}

		if (_methodName261.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes261, parameterTypes)) {
			return CourseLocalServiceUtil.countCoursesCatalogByTitleCategoriesTags((java.lang.String)arguments[0],
				(long[])arguments[1], (long[])arguments[2],
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(),
				((Long)arguments[5]).longValue(), (java.lang.String)arguments[6]);
		}

		if (_methodName262.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes262, parameterTypes)) {
			return CourseLocalServiceUtil.getCatalogCoursesAssetTags((java.lang.String)arguments[0],
				(long[])arguments[1], ((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(), (java.lang.String)arguments[5]);
		}

		if (_methodName263.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes263, parameterTypes)) {
			return CourseLocalServiceUtil.countCategoryCourses((java.lang.String)arguments[0],
				(long[])arguments[1], (long[])arguments[2],
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(),
				((Long)arguments[5]).longValue(), (java.lang.String)arguments[6]);
		}

		if (_methodName264.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes264, parameterTypes)) {
			return CourseLocalServiceUtil.countTagCourses((java.lang.String)arguments[0],
				(long[])arguments[1], (long[])arguments[2],
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(),
				((Long)arguments[5]).longValue(), (java.lang.String)arguments[6]);
		}

		if (_methodName265.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes265, parameterTypes)) {
			return CourseLocalServiceUtil.getMyCourses(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.theme.ThemeDisplay)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName266.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes266, parameterTypes)) {
			return CourseLocalServiceUtil.countMyCourses(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.theme.ThemeDisplay)arguments[2]);
		}

		if (_methodName267.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes267, parameterTypes)) {
			return CourseLocalServiceUtil.hasUserTries(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName268.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes268, parameterTypes)) {
			return CourseLocalServiceUtil.getPublicCoursesByCompanyId((java.lang.Long)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName269.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes269, parameterTypes)) {
			return CourseLocalServiceUtil.getChildCourses(((Long)arguments[0]).longValue());
		}

		if (_methodName270.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes270, parameterTypes)) {
			return CourseLocalServiceUtil.getCoursesParents(((Long)arguments[0]).longValue());
		}

		if (_methodName271.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes271, parameterTypes)) {
			CourseLocalServiceUtil.addStudentToCourseWithDates(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.util.Date)arguments[2],
				(java.util.Date)arguments[3]);
		}

		if (_methodName272.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes272, parameterTypes)) {
			CourseLocalServiceUtil.editUserInscriptionDates(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.util.Date)arguments[2],
				(java.util.Date)arguments[3]);
		}

		if (_methodName273.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes273, parameterTypes)) {
			return CourseLocalServiceUtil.isLocked((com.liferay.lms.model.Course)arguments[0],
				(com.liferay.portal.model.User)arguments[1]);
		}

		if (_methodName274.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes274, parameterTypes)) {
			return CourseLocalServiceUtil.canAccessLock(((Long)arguments[0]).longValue(),
				(com.liferay.portal.model.User)arguments[1]);
		}

		if (_methodName275.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes275, parameterTypes)) {
			return CourseLocalServiceUtil.getLastModuleDateInCourse(((Long)arguments[0]).longValue());
		}

		if (_methodName276.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes276, parameterTypes)) {
			return CourseLocalServiceUtil.getFirstModuleDateInCourse(((Long)arguments[0]).longValue());
		}

		if (_methodName277.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes277, parameterTypes)) {
			return CourseLocalServiceUtil.getImageURL((com.liferay.lms.model.Course)arguments[0],
				(com.liferay.portal.theme.ThemeDisplay)arguments[1]);
		}

		if (_methodName278.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes278, parameterTypes)) {
			return CourseLocalServiceUtil.addStudentToCourseByUserId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName209;
	private String[] _methodParameterTypes209;
	private String _methodName210;
	private String[] _methodParameterTypes210;
	private String _methodName215;
	private String[] _methodParameterTypes215;
	private String _methodName216;
	private String[] _methodParameterTypes216;
	private String _methodName217;
	private String[] _methodParameterTypes217;
	private String _methodName218;
	private String[] _methodParameterTypes218;
	private String _methodName219;
	private String[] _methodParameterTypes219;
	private String _methodName220;
	private String[] _methodParameterTypes220;
	private String _methodName221;
	private String[] _methodParameterTypes221;
	private String _methodName222;
	private String[] _methodParameterTypes222;
	private String _methodName223;
	private String[] _methodParameterTypes223;
	private String _methodName224;
	private String[] _methodParameterTypes224;
	private String _methodName225;
	private String[] _methodParameterTypes225;
	private String _methodName226;
	private String[] _methodParameterTypes226;
	private String _methodName227;
	private String[] _methodParameterTypes227;
	private String _methodName228;
	private String[] _methodParameterTypes228;
	private String _methodName233;
	private String[] _methodParameterTypes233;
	private String _methodName234;
	private String[] _methodParameterTypes234;
	private String _methodName235;
	private String[] _methodParameterTypes235;
	private String _methodName236;
	private String[] _methodParameterTypes236;
	private String _methodName237;
	private String[] _methodParameterTypes237;
	private String _methodName238;
	private String[] _methodParameterTypes238;
	private String _methodName239;
	private String[] _methodParameterTypes239;
	private String _methodName240;
	private String[] _methodParameterTypes240;
	private String _methodName241;
	private String[] _methodParameterTypes241;
	private String _methodName242;
	private String[] _methodParameterTypes242;
	private String _methodName243;
	private String[] _methodParameterTypes243;
	private String _methodName244;
	private String[] _methodParameterTypes244;
	private String _methodName245;
	private String[] _methodParameterTypes245;
	private String _methodName246;
	private String[] _methodParameterTypes246;
	private String _methodName247;
	private String[] _methodParameterTypes247;
	private String _methodName248;
	private String[] _methodParameterTypes248;
	private String _methodName249;
	private String[] _methodParameterTypes249;
	private String _methodName250;
	private String[] _methodParameterTypes250;
	private String _methodName251;
	private String[] _methodParameterTypes251;
	private String _methodName253;
	private String[] _methodParameterTypes253;
	private String _methodName254;
	private String[] _methodParameterTypes254;
	private String _methodName255;
	private String[] _methodParameterTypes255;
	private String _methodName256;
	private String[] _methodParameterTypes256;
	private String _methodName257;
	private String[] _methodParameterTypes257;
	private String _methodName258;
	private String[] _methodParameterTypes258;
	private String _methodName259;
	private String[] _methodParameterTypes259;
	private String _methodName260;
	private String[] _methodParameterTypes260;
	private String _methodName261;
	private String[] _methodParameterTypes261;
	private String _methodName262;
	private String[] _methodParameterTypes262;
	private String _methodName263;
	private String[] _methodParameterTypes263;
	private String _methodName264;
	private String[] _methodParameterTypes264;
	private String _methodName265;
	private String[] _methodParameterTypes265;
	private String _methodName266;
	private String[] _methodParameterTypes266;
	private String _methodName267;
	private String[] _methodParameterTypes267;
	private String _methodName268;
	private String[] _methodParameterTypes268;
	private String _methodName269;
	private String[] _methodParameterTypes269;
	private String _methodName270;
	private String[] _methodParameterTypes270;
	private String _methodName271;
	private String[] _methodParameterTypes271;
	private String _methodName272;
	private String[] _methodParameterTypes272;
	private String _methodName273;
	private String[] _methodParameterTypes273;
	private String _methodName274;
	private String[] _methodParameterTypes274;
	private String _methodName275;
	private String[] _methodParameterTypes275;
	private String _methodName276;
	private String[] _methodParameterTypes276;
	private String _methodName277;
	private String[] _methodParameterTypes277;
	private String _methodName278;
	private String[] _methodParameterTypes278;
}