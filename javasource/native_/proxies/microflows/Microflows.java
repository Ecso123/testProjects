// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package native_.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Native_ module
	public static void dS_EmptyDefaultEntity(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Native_.DS_EmptyDefaultEntity").withParams(params).execute(context);
	}
	public static void dS_EmptyUsers(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Native_.DS_EmptyUsers").withParams(params).execute(context);
	}
	public static native_widgets.proxies.Entity dS_Entity(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Native_.DS_Entity").withParams(params).execute(context);
		return result == null ? null : native_widgets.proxies.Entity.initialize(context, result);
	}
}