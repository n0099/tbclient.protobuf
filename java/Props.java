package tbclient;

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
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class Props extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_END_TIME = "";
    public static final String DEFAULT_EXPIRED_NOTIFY = "";
    public static final String DEFAULT_EXPIRING_NOTIFY = "";
    public static final Integer DEFAULT_LEFT_NUM;
    public static final String DEFAULT_NOTICE = "";
    public static final Integer DEFAULT_NUM;
    public static final String DEFAULT_OPEN_STATUS = "";
    public static final List<String> DEFAULT_PATTERN;
    public static final String DEFAULT_PROPS_CATEGORY = "";
    public static final Integer DEFAULT_PROPS_ID;
    public static final String DEFAULT_PROPS_TYPE = "";
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_UPDATE_TIME;
    public static final String DEFAULT_USED_STATUS = "";
    public static final List<String> DEFAULT__WORD;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 14, type = Message.Datatype.STRING)
    public final List<String> _word;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String end_time;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String expired_notify;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String expiring_notify;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer left_num;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String notice;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer num;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String open_status;
    @ProtoField(label = Message.Label.REPEATED, tag = 15, type = Message.Datatype.STRING)
    public final List<String> pattern;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String props_category;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String props_type;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer update_time;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String used_status;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<Props> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<String> _word;
        public String end_time;
        public String expired_notify;
        public String expiring_notify;
        public Integer left_num;
        public String notice;
        public Integer num;
        public String open_status;
        public List<String> pattern;
        public String props_category;
        public Integer props_id;
        public String props_type;
        public String title;
        public Integer update_time;
        public String used_status;

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
        public Builder(Props props) {
            super(props);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {props};
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
            if (props == null) {
                return;
            }
            this.props_id = props.props_id;
            this.props_type = props.props_type;
            this.props_category = props.props_category;
            this.left_num = props.left_num;
            this.used_status = props.used_status;
            this.num = props.num;
            this.end_time = props.end_time;
            this.notice = props.notice;
            this.update_time = props.update_time;
            this.open_status = props.open_status;
            this.expiring_notify = props.expiring_notify;
            this.expired_notify = props.expired_notify;
            this.title = props.title;
            this._word = Message.copyOf(props._word);
            this.pattern = Message.copyOf(props.pattern);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Props build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Props(this, z, null) : (Props) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(548972085, "Ltbclient/Props;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(548972085, "Ltbclient/Props;");
                return;
            }
        }
        DEFAULT_PROPS_ID = 0;
        DEFAULT_LEFT_NUM = 0;
        DEFAULT_NUM = 0;
        DEFAULT_UPDATE_TIME = 0;
        DEFAULT__WORD = Collections.emptyList();
        DEFAULT_PATTERN = Collections.emptyList();
    }

    public /* synthetic */ Props(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Props(Builder builder, boolean z) {
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
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            String str = builder.props_type;
            if (str == null) {
                this.props_type = "";
            } else {
                this.props_type = str;
            }
            String str2 = builder.props_category;
            if (str2 == null) {
                this.props_category = "";
            } else {
                this.props_category = str2;
            }
            Integer num2 = builder.left_num;
            if (num2 == null) {
                this.left_num = DEFAULT_LEFT_NUM;
            } else {
                this.left_num = num2;
            }
            String str3 = builder.used_status;
            if (str3 == null) {
                this.used_status = "";
            } else {
                this.used_status = str3;
            }
            Integer num3 = builder.num;
            if (num3 == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num3;
            }
            String str4 = builder.end_time;
            if (str4 == null) {
                this.end_time = "";
            } else {
                this.end_time = str4;
            }
            String str5 = builder.notice;
            if (str5 == null) {
                this.notice = "";
            } else {
                this.notice = str5;
            }
            Integer num4 = builder.update_time;
            if (num4 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num4;
            }
            String str6 = builder.open_status;
            if (str6 == null) {
                this.open_status = "";
            } else {
                this.open_status = str6;
            }
            String str7 = builder.expiring_notify;
            if (str7 == null) {
                this.expiring_notify = "";
            } else {
                this.expiring_notify = str7;
            }
            String str8 = builder.expired_notify;
            if (str8 == null) {
                this.expired_notify = "";
            } else {
                this.expired_notify = str8;
            }
            String str9 = builder.title;
            if (str9 == null) {
                this.title = "";
            } else {
                this.title = str9;
            }
            List<String> list = builder._word;
            if (list == null) {
                this._word = DEFAULT__WORD;
            } else {
                this._word = Message.immutableCopyOf(list);
            }
            List<String> list2 = builder.pattern;
            if (list2 == null) {
                this.pattern = DEFAULT_PATTERN;
                return;
            } else {
                this.pattern = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.props_id = builder.props_id;
        this.props_type = builder.props_type;
        this.props_category = builder.props_category;
        this.left_num = builder.left_num;
        this.used_status = builder.used_status;
        this.num = builder.num;
        this.end_time = builder.end_time;
        this.notice = builder.notice;
        this.update_time = builder.update_time;
        this.open_status = builder.open_status;
        this.expiring_notify = builder.expiring_notify;
        this.expired_notify = builder.expired_notify;
        this.title = builder.title;
        this._word = Message.immutableCopyOf(builder._word);
        this.pattern = Message.immutableCopyOf(builder.pattern);
    }
}
