package tbclient;

import androidx.core.view.InputDeviceCompat;
import com.baidu.android.imsdk.internal.Constants;
import com.baidu.mobads.container.util.AdIconUtil;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class AdCloseInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CONFIRM_TITLE = "";
    public static final List<String> DEFAULT_REASONS;
    public static final Integer DEFAULT_SUPPORT_CLOSE;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5)
    public final ActionControl action_control;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String confirm_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
    public final List<String> reasons;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer support_close;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<AdCloseInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public ActionControl action_control;
        public String confirm_title;
        public List<String> reasons;
        public Integer support_close;
        public String title;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(AdCloseInfo adCloseInfo) {
            super(adCloseInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {adCloseInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (adCloseInfo == null) {
                return;
            }
            this.support_close = adCloseInfo.support_close;
            this.title = adCloseInfo.title;
            this.reasons = Message.copyOf(adCloseInfo.reasons);
            this.confirm_title = adCloseInfo.confirm_title;
            this.action_control = adCloseInfo.action_control;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdCloseInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AdCloseInfo(this, z, null) : (AdCloseInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1298349918, "Ltbclient/AdCloseInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1298349918, "Ltbclient/AdCloseInfo;");
                return;
            }
        }
        DEFAULT_SUPPORT_CLOSE = 0;
        DEFAULT_REASONS = Collections.emptyList();
    }

    public /* synthetic */ AdCloseInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    public static AdCloseInfo parseFromJson(JSONObject jSONObject) {
        InterceptResult invokeL;
        Interceptable interceptable = $ic;
        if (interceptable == null || (invokeL = interceptable.invokeL(InputDeviceCompat.SOURCE_TRACKBALL, null, jSONObject)) == null) {
            if (jSONObject == null) {
                return null;
            }
            Builder builder = new Builder();
            builder.support_close = Integer.valueOf(jSONObject.optInt("support_close"));
            builder.title = jSONObject.optString("title");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("reasons");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        arrayList.add(optJSONArray.getString(i2));
                    } catch (Exception unused) {
                    }
                }
                builder.reasons = arrayList;
            }
            builder.reasons = arrayList;
            builder.confirm_title = jSONObject.optString("confirm_title");
            builder.action_control = ActionControl.parseFromJson(jSONObject.optJSONObject("action_control"));
            return builder.build(false);
        }
        return (AdCloseInfo) invokeL.objValue;
    }

    public static JSONObject toJson(AdCloseInfo adCloseInfo) {
        InterceptResult invokeL;
        Interceptable interceptable = $ic;
        if (interceptable == null || (invokeL = interceptable.invokeL(AdIconUtil.AD_TEXT_ID, null, adCloseInfo)) == null) {
            if (adCloseInfo == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("support_close", adCloseInfo.support_close);
                jSONObject.put("title", adCloseInfo.title);
                JSONArray jSONArray = new JSONArray();
                for (String str : adCloseInfo.reasons) {
                    jSONArray.put(str);
                }
                jSONObject.put("reasons", jSONArray);
                jSONObject.put("confirm_title", adCloseInfo.confirm_title);
                jSONObject.put("action_control", ActionControl.toJson(adCloseInfo.action_control));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }
        return (JSONObject) invokeL.objValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdCloseInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Integer num = builder.support_close;
            if (num == null) {
                this.support_close = DEFAULT_SUPPORT_CLOSE;
            } else {
                this.support_close = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            List<String> list = builder.reasons;
            if (list == null) {
                this.reasons = DEFAULT_REASONS;
            } else {
                this.reasons = Message.immutableCopyOf(list);
            }
            String str2 = builder.confirm_title;
            if (str2 == null) {
                this.confirm_title = "";
            } else {
                this.confirm_title = str2;
            }
            this.action_control = builder.action_control;
            return;
        }
        this.support_close = builder.support_close;
        this.title = builder.title;
        this.reasons = Message.immutableCopyOf(builder.reasons);
        this.confirm_title = builder.confirm_title;
        this.action_control = builder.action_control;
    }
}
