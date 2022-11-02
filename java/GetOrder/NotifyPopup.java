package tbclient.GetOrder;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class NotifyPopup extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_APPENDIX_LINK = "";
    public static final Integer DEFAULT_APPENDIX_OPTIONAL;
    public static final String DEFAULT_APPENDIX_TEXT = "";
    public static final Integer DEFAULT_APP_SIZE;
    public static final String DEFAULT_APP_VERSION = "";
    public static final String DEFAULT_CHANGELOGS = "";
    public static final String DEFAULT_HINT = "";
    public static final String DEFAULT_N_BTN_LINK = "";
    public static final String DEFAULT_N_BTN_TEXT = "";
    public static final Integer DEFAULT_POPUP_ID;
    public static final Integer DEFAULT_POPUP_TIMES;
    public static final Integer DEFAULT_POPUP_TYPE;
    public static final String DEFAULT_Y_BTN_LINK = "";
    public static final String DEFAULT_Y_BTN_TEXT = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer app_size;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String app_version;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String appendix_link;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer appendix_optional;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String appendix_text;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String changelogs;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String hint;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String n_btn_link;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String n_btn_text;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer popup_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer popup_times;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer popup_type;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String y_btn_link;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String y_btn_text;

    /* renamed from: tbclient.GetOrder.NotifyPopup$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<NotifyPopup> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer app_size;
        public String app_version;
        public String appendix_link;
        public Integer appendix_optional;
        public String appendix_text;
        public String changelogs;
        public String hint;
        public String n_btn_link;
        public String n_btn_text;
        public Integer popup_id;
        public Integer popup_times;
        public Integer popup_type;
        public String y_btn_link;
        public String y_btn_text;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(NotifyPopup notifyPopup) {
            super(notifyPopup);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {notifyPopup};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (notifyPopup == null) {
                return;
            }
            this.popup_id = notifyPopup.popup_id;
            this.popup_times = notifyPopup.popup_times;
            this.popup_type = notifyPopup.popup_type;
            this.hint = notifyPopup.hint;
            this.app_version = notifyPopup.app_version;
            this.app_size = notifyPopup.app_size;
            this.changelogs = notifyPopup.changelogs;
            this.appendix_text = notifyPopup.appendix_text;
            this.appendix_link = notifyPopup.appendix_link;
            this.appendix_optional = notifyPopup.appendix_optional;
            this.y_btn_text = notifyPopup.y_btn_text;
            this.y_btn_link = notifyPopup.y_btn_link;
            this.n_btn_text = notifyPopup.n_btn_text;
            this.n_btn_link = notifyPopup.n_btn_link;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NotifyPopup build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new NotifyPopup(this, z, null);
            }
            return (NotifyPopup) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(408779333, "Ltbclient/GetOrder/NotifyPopup;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(408779333, "Ltbclient/GetOrder/NotifyPopup;");
                return;
            }
        }
        DEFAULT_POPUP_ID = 0;
        DEFAULT_POPUP_TIMES = 0;
        DEFAULT_POPUP_TYPE = 0;
        DEFAULT_APP_SIZE = 0;
        DEFAULT_APPENDIX_OPTIONAL = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyPopup(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Integer num = builder.popup_id;
            if (num == null) {
                this.popup_id = DEFAULT_POPUP_ID;
            } else {
                this.popup_id = num;
            }
            Integer num2 = builder.popup_times;
            if (num2 == null) {
                this.popup_times = DEFAULT_POPUP_TIMES;
            } else {
                this.popup_times = num2;
            }
            Integer num3 = builder.popup_type;
            if (num3 == null) {
                this.popup_type = DEFAULT_POPUP_TYPE;
            } else {
                this.popup_type = num3;
            }
            String str = builder.hint;
            if (str == null) {
                this.hint = "";
            } else {
                this.hint = str;
            }
            String str2 = builder.app_version;
            if (str2 == null) {
                this.app_version = "";
            } else {
                this.app_version = str2;
            }
            Integer num4 = builder.app_size;
            if (num4 == null) {
                this.app_size = DEFAULT_APP_SIZE;
            } else {
                this.app_size = num4;
            }
            String str3 = builder.changelogs;
            if (str3 == null) {
                this.changelogs = "";
            } else {
                this.changelogs = str3;
            }
            String str4 = builder.appendix_text;
            if (str4 == null) {
                this.appendix_text = "";
            } else {
                this.appendix_text = str4;
            }
            String str5 = builder.appendix_link;
            if (str5 == null) {
                this.appendix_link = "";
            } else {
                this.appendix_link = str5;
            }
            Integer num5 = builder.appendix_optional;
            if (num5 == null) {
                this.appendix_optional = DEFAULT_APPENDIX_OPTIONAL;
            } else {
                this.appendix_optional = num5;
            }
            String str6 = builder.y_btn_text;
            if (str6 == null) {
                this.y_btn_text = "";
            } else {
                this.y_btn_text = str6;
            }
            String str7 = builder.y_btn_link;
            if (str7 == null) {
                this.y_btn_link = "";
            } else {
                this.y_btn_link = str7;
            }
            String str8 = builder.n_btn_text;
            if (str8 == null) {
                this.n_btn_text = "";
            } else {
                this.n_btn_text = str8;
            }
            String str9 = builder.n_btn_link;
            if (str9 == null) {
                this.n_btn_link = "";
                return;
            } else {
                this.n_btn_link = str9;
                return;
            }
        }
        this.popup_id = builder.popup_id;
        this.popup_times = builder.popup_times;
        this.popup_type = builder.popup_type;
        this.hint = builder.hint;
        this.app_version = builder.app_version;
        this.app_size = builder.app_size;
        this.changelogs = builder.changelogs;
        this.appendix_text = builder.appendix_text;
        this.appendix_link = builder.appendix_link;
        this.appendix_optional = builder.appendix_optional;
        this.y_btn_text = builder.y_btn_text;
        this.y_btn_link = builder.y_btn_link;
        this.n_btn_text = builder.n_btn_text;
        this.n_btn_link = builder.n_btn_link;
    }

    public /* synthetic */ NotifyPopup(Builder builder, boolean z, AnonymousClass1 anonymousClass1) {
        this(builder, z);
    }
}
