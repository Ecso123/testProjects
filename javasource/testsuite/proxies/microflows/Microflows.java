// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testsuite.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the TestSuite module
	public static void aCT_DeleteImage(IContext context, testsuite.proxies.Image _image)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Image", _image == null ? null : _image.getMendixObject());
		Core.microflowCall("TestSuite.ACT_DeleteImage").withParams(params).execute(context);
	}
	public static void aCT_OnClickImage(IContext context, testsuite.proxies.Image _carouselImage)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CarouselImage", _carouselImage == null ? null : _carouselImage.getMendixObject());
		Core.microflowCall("TestSuite.ACT_OnClickImage").withParams(params).execute(context);
	}
	public static void aCT_OnClickImage_ClosePage(IContext context, testsuite.proxies.Image _carouselImage)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CarouselImage", _carouselImage == null ? null : _carouselImage.getMendixObject());
		Core.microflowCall("TestSuite.ACT_OnClickImage_ClosePage").withParams(params).execute(context);
	}
	public static void aCT_OnClickImageNoContext(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("TestSuite.ACT_OnClickImageNoContext").withParams(params).execute(context);
	}
	public static void aCT_OnClickImageNoContext_2(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("TestSuite.ACT_OnClickImageNoContext_2").withParams(params).execute(context);
	}
	public static void aCT_OnClickImageNoContext_3(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("TestSuite.ACT_OnClickImageNoContext_3").withParams(params).execute(context);
	}
	public static void aCT_OnClickImageNoContext_4(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("TestSuite.ACT_OnClickImageNoContext_4").withParams(params).execute(context);
	}
	public static void aCT_SaveAndRefresh(IContext context, testsuite.proxies.Image _image)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Image", _image == null ? null : _image.getMendixObject());
		Core.microflowCall("TestSuite.ACT_SaveAndRefresh").withParams(params).execute(context);
	}
	public static void aCT_Upload(IContext context, testsuite.proxies.Carousel _carousel)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Carousel", _carousel == null ? null : _carousel.getMendixObject());
		Core.microflowCall("TestSuite.ACT_Upload").withParams(params).execute(context);
	}
	public static boolean afterStartup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("TestSuite.AfterStartup").withParams(params).execute(context);
	}
	public static testsuite.proxies.Carousel dS_GetCarousel(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("TestSuite.DS_GetCarousel").withParams(params).execute(context);
		return result == null ? null : testsuite.proxies.Carousel.initialize(context, result);
	}
	public static java.util.List<testsuite.proxies.Image> dSL_DatasourceTestData(IContext context, testsuite.proxies.Carousel _carousel)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Carousel", _carousel == null ? null : _carousel.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("TestSuite.DSL_DatasourceTestData").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> testsuite.proxies.Image.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static java.util.List<testsuite.proxies.Image> dSL_DatasourceTestData_NoContext(IContext context, testsuite.proxies.Carousel _carousel)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Carousel", _carousel == null ? null : _carousel.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("TestSuite.DSL_DatasourceTestData_NoContext").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> testsuite.proxies.Image.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static java.util.List<testsuite.proxies.Image> dSL_DatasourceTestData_withDelay(IContext context, testsuite.proxies.Carousel _carousel)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Carousel", _carousel == null ? null : _carousel.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("TestSuite.DSL_DatasourceTestData_withDelay").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> testsuite.proxies.Image.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static java.util.List<testsuite.proxies.Carousel> dSL_Tests(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("TestSuite.DSL_Tests").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> testsuite.proxies.Carousel.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static testsuite.proxies.Carousel dSS_NoContext(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("TestSuite.DSS_NoContext").withParams(params).execute(context);
		return result == null ? null : testsuite.proxies.Carousel.initialize(context, result);
	}
	public static testsuite.proxies.Carousel gD_ReturnCarouselObject(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("TestSuite.GD_ReturnCarouselObject").withParams(params).execute(context);
		return result == null ? null : testsuite.proxies.Carousel.initialize(context, result);
	}
	public static void iVK_Commit(IContext context, testsuite.proxies.Carousel _test)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Test", _test == null ? null : _test.getMendixObject());
		Core.microflowCall("TestSuite.IVK_Commit").withParams(params).execute(context);
	}
	public static void iVK_MicroflowWithError(IContext context, testsuite.proxies.Image _image)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Image", _image == null ? null : _image.getMendixObject());
		Core.microflowCall("TestSuite.IVK_MicroflowWithError").withParams(params).execute(context);
	}
	public static void iVK_RefreshInClient(IContext context, testsuite.proxies.Carousel _test)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Test", _test == null ? null : _test.getMendixObject());
		Core.microflowCall("TestSuite.IVK_RefreshInClient").withParams(params).execute(context);
	}
	public static void iVK_ShowValidations(IContext context, testsuite.proxies.Carousel _test)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Test", _test == null ? null : _test.getMendixObject());
		Core.microflowCall("TestSuite.IVK_ShowValidations").withParams(params).execute(context);
	}
	public static void oCh_Test(IContext context, testsuite.proxies.Carousel _test)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Test", _test == null ? null : _test.getMendixObject());
		Core.microflowCall("TestSuite.OCh_Test").withParams(params).execute(context);
	}
	public static void onClick_Dynamic(IContext context, testsuite.proxies.Image _image)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Image", _image == null ? null : _image.getMendixObject());
		Core.microflowCall("TestSuite.OnClick_Dynamic").withParams(params).execute(context);
	}
	public static void onClick_Static1(IContext context, testsuite.proxies.Carousel _carousel)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Carousel", _carousel == null ? null : _carousel.getMendixObject());
		Core.microflowCall("TestSuite.OnClick_Static1").withParams(params).execute(context);
	}
	public static void onClick_Static2(IContext context, testsuite.proxies.Carousel _carousel)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Carousel", _carousel == null ? null : _carousel.getMendixObject());
		Core.microflowCall("TestSuite.OnClick_Static2").withParams(params).execute(context);
	}
	public static void onClickWithError(IContext context, testsuite.proxies.Carousel _carousel)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Carousel", _carousel == null ? null : _carousel.getMendixObject());
		Core.microflowCall("TestSuite.OnClickWithError").withParams(params).execute(context);
	}
}