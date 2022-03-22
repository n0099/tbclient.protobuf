package tbclient.CompleteTask;

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
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ACTIVITY_ID;
    public static final Integer DEFAULT_AHEAD_TYPE;
    public static final String DEFAULT_BTN_CANCEL = "";
    public static final String DEFAULT_BTN_COLOR = "";
    public static final String DEFAULT_BTN_CONFIRM = "";
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_BTN_TEXT_COLOR = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final Integer DEFAULT_INTERFACE_TYPE;
    public static final Integer DEFAULT_IS_NOT_COMPLETE;
    public static final String DEFAULT_MESSAGE = "";
    public static final String DEFAULT_MESSAGE_COLOR = "";
    public static final Integer DEFAULT_MISSION_ID;
    public static final Double DEFAULT_OPACITY;
    public static final String DEFAULT_SCHEMA = "";
    public static final Integer DEFAULT_SHOW_TYPE;
    public static final Integer DEFAULT_TOAST_DURATION;
    public static final String DEFAULT_TOKEN = "";
    public static final String DEFAULT_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer activity_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer ahead_type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String btn_cancel;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String btn_color;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String btn_confirm;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String btn_text_color;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer interface_type;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer is_not_complete;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String message;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String message_color;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer mission_id;
    @ProtoField(tag = 14, type = Message.Datatype.DOUBLE)
    public final Double opacity;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer show_type;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer toast_duration;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String token;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer activity_id;
        public Integer ahead_type;
        public String btn_cancel;
        public String btn_color;
        public String btn_confirm;
        public String btn_text;
        public String btn_text_color;
        public String img_url;
        public Integer interface_type;
        public Integer is_not_complete;
        public String message;
        public String message_color;
        public Integer mission_id;
        public Double opacity;
        public String schema;
        public Integer show_type;
        public Integer toast_duration;
        public String token;
        public String url;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.show_type = dataRes.show_type;
            this.ahead_type = dataRes.ahead_type;
            this.message = dataRes.message;
            this.btn_text = dataRes.btn_text;
            this.btn_confirm = dataRes.btn_confirm;
            this.btn_cancel = dataRes.btn_cancel;
            this.toast_duration = dataRes.toast_duration;
            this.img_url = dataRes.img_url;
            this.url = dataRes.url;
            this.schema = dataRes.schema;
            this.token = dataRes.token;
            this.activity_id = dataRes.activity_id;
            this.mission_id = dataRes.mission_id;
            this.opacity = dataRes.opacity;
            this.btn_color = dataRes.btn_color;
            this.message_color = dataRes.message_color;
            this.btn_text_color = dataRes.btn_text_color;
            this.interface_type = dataRes.interface_type;
            this.is_not_complete = dataRes.is_not_complete;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(509202540, "Ltbclient/CompleteTask/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(509202540, "Ltbclient/CompleteTask/DataRes;");
                return;
            }
        }
        DEFAULT_SHOW_TYPE = 0;
        DEFAULT_AHEAD_TYPE = 0;
        DEFAULT_TOAST_DURATION = 0;
        DEFAULT_ACTIVITY_ID = 0;
        DEFAULT_MISSION_ID = 0;
        DEFAULT_OPACITY = Double.valueOf(0.0d);
        DEFAULT_INTERFACE_TYPE = 0;
        DEFAULT_IS_NOT_COMPLETE = 0;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            Integer num = builder.show_type;
            if (num == null) {
                this.show_type = DEFAULT_SHOW_TYPE;
            } else {
                this.show_type = num;
            }
            Integer num2 = builder.ahead_type;
            if (num2 == null) {
                this.ahead_type = DEFAULT_AHEAD_TYPE;
            } else {
                this.ahead_type = num2;
            }
            String str = builder.message;
            if (str == null) {
                this.message = "";
            } else {
                this.message = str;
            }
            String str2 = builder.btn_text;
            if (str2 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str2;
            }
            String str3 = builder.btn_confirm;
            if (str3 == null) {
                this.btn_confirm = "";
            } else {
                this.btn_confirm = str3;
            }
            String str4 = builder.btn_cancel;
            if (str4 == null) {
                this.btn_cancel = "";
            } else {
                this.btn_cancel = str4;
            }
            Integer num3 = builder.toast_duration;
            if (num3 == null) {
                this.toast_duration = DEFAULT_TOAST_DURATION;
            } else {
                this.toast_duration = num3;
            }
            String str5 = builder.img_url;
            if (str5 == null) {
                this.img_url = "";
            } else {
                this.img_url = str5;
            }
            String str6 = builder.url;
            if (str6 == null) {
                this.url = "";
            } else {
                this.url = str6;
            }
            String str7 = builder.schema;
            if (str7 == null) {
                this.schema = "";
            } else {
                this.schema = str7;
            }
            String str8 = builder.token;
            if (str8 == null) {
                this.token = "";
            } else {
                this.token = str8;
            }
            Integer num4 = builder.activity_id;
            if (num4 == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = num4;
            }
            Integer num5 = builder.mission_id;
            if (num5 == null) {
                this.mission_id = DEFAULT_MISSION_ID;
            } else {
                this.mission_id = num5;
            }
            Double d2 = builder.opacity;
            if (d2 == null) {
                this.opacity = DEFAULT_OPACITY;
            } else {
                this.opacity = d2;
            }
            String str9 = builder.btn_color;
            if (str9 == null) {
                this.btn_color = "";
            } else {
                this.btn_color = str9;
            }
            String str10 = builder.message_color;
            if (str10 == null) {
                this.message_color = "";
            } else {
                this.message_color = str10;
            }
            String str11 = builder.btn_text_color;
            if (str11 == null) {
                this.btn_text_color = "";
            } else {
                this.btn_text_color = str11;
            }
            Integer num6 = builder.interface_type;
            if (num6 == null) {
                this.interface_type = DEFAULT_INTERFACE_TYPE;
            } else {
                this.interface_type = num6;
            }
            Integer num7 = builder.is_not_complete;
            if (num7 == null) {
                this.is_not_complete = DEFAULT_IS_NOT_COMPLETE;
                return;
            } else {
                this.is_not_complete = num7;
                return;
            }
        }
        this.show_type = builder.show_type;
        this.ahead_type = builder.ahead_type;
        this.message = builder.message;
        this.btn_text = builder.btn_text;
        this.btn_confirm = builder.btn_confirm;
        this.btn_cancel = builder.btn_cancel;
        this.toast_duration = builder.toast_duration;
        this.img_url = builder.img_url;
        this.url = builder.url;
        this.schema = builder.schema;
        this.token = builder.token;
        this.activity_id = builder.activity_id;
        this.mission_id = builder.mission_id;
        this.opacity = builder.opacity;
        this.btn_color = builder.btn_color;
        this.message_color = builder.message_color;
        this.btn_text_color = builder.btn_text_color;
        this.interface_type = builder.interface_type;
        this.is_not_complete = builder.is_not_complete;
    }
}
