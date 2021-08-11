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
/* loaded from: classes2.dex */
public final class PollInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_END_TIME;
    public static final Integer DEFAULT_IS_MULTI;
    public static final Integer DEFAULT_IS_POLLED;
    public static final Integer DEFAULT_LAST_TIME;
    public static final List<PollOption> DEFAULT_OPTIONS;
    public static final Integer DEFAULT_OPTIONS_COUNT;
    public static final String DEFAULT_POLLED_VALUE = "";
    public static final Integer DEFAULT_STATUS;
    public static final String DEFAULT_TIPS = "";
    public static final String DEFAULT_TITLE = "";
    public static final Long DEFAULT_TOTAL_NUM;
    public static final Long DEFAULT_TOTAL_POLL;
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer end_time;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_multi;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_polled;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer last_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<PollOption> options;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer options_count;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String polled_value;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tips;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long total_num;
    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long total_poll;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PollInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer end_time;
        public Integer is_multi;
        public Integer is_polled;
        public Integer last_time;
        public List<PollOption> options;
        public Integer options_count;
        public String polled_value;
        public Integer status;
        public String tips;
        public String title;
        public Long total_num;
        public Long total_poll;
        public Integer type;

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
        public Builder(PollInfo pollInfo) {
            super(pollInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pollInfo};
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
            if (pollInfo == null) {
                return;
            }
            this.type = pollInfo.type;
            this.is_multi = pollInfo.is_multi;
            this.total_num = pollInfo.total_num;
            this.options_count = pollInfo.options_count;
            this.is_polled = pollInfo.is_polled;
            this.polled_value = pollInfo.polled_value;
            this.tips = pollInfo.tips;
            this.end_time = pollInfo.end_time;
            this.options = Message.copyOf(pollInfo.options);
            this.status = pollInfo.status;
            this.total_poll = pollInfo.total_poll;
            this.title = pollInfo.title;
            this.last_time = pollInfo.last_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PollInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PollInfo(this, z, null) : (PollInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-260770012, "Ltbclient/PollInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-260770012, "Ltbclient/PollInfo;");
                return;
            }
        }
        DEFAULT_TYPE = 0;
        DEFAULT_IS_MULTI = 0;
        DEFAULT_TOTAL_NUM = 0L;
        DEFAULT_OPTIONS_COUNT = 0;
        DEFAULT_IS_POLLED = 0;
        DEFAULT_END_TIME = 0;
        DEFAULT_OPTIONS = Collections.emptyList();
        DEFAULT_STATUS = 0;
        DEFAULT_TOTAL_POLL = 0L;
        DEFAULT_LAST_TIME = 0;
    }

    public /* synthetic */ PollInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollInfo(Builder builder, boolean z) {
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
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.is_multi;
            if (num2 == null) {
                this.is_multi = DEFAULT_IS_MULTI;
            } else {
                this.is_multi = num2;
            }
            Long l = builder.total_num;
            if (l == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = l;
            }
            Integer num3 = builder.options_count;
            if (num3 == null) {
                this.options_count = DEFAULT_OPTIONS_COUNT;
            } else {
                this.options_count = num3;
            }
            Integer num4 = builder.is_polled;
            if (num4 == null) {
                this.is_polled = DEFAULT_IS_POLLED;
            } else {
                this.is_polled = num4;
            }
            String str = builder.polled_value;
            if (str == null) {
                this.polled_value = "";
            } else {
                this.polled_value = str;
            }
            String str2 = builder.tips;
            if (str2 == null) {
                this.tips = "";
            } else {
                this.tips = str2;
            }
            Integer num5 = builder.end_time;
            if (num5 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num5;
            }
            List<PollOption> list = builder.options;
            if (list == null) {
                this.options = DEFAULT_OPTIONS;
            } else {
                this.options = Message.immutableCopyOf(list);
            }
            Integer num6 = builder.status;
            if (num6 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num6;
            }
            Long l2 = builder.total_poll;
            if (l2 == null) {
                this.total_poll = DEFAULT_TOTAL_POLL;
            } else {
                this.total_poll = l2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            Integer num7 = builder.last_time;
            if (num7 == null) {
                this.last_time = DEFAULT_LAST_TIME;
                return;
            } else {
                this.last_time = num7;
                return;
            }
        }
        this.type = builder.type;
        this.is_multi = builder.is_multi;
        this.total_num = builder.total_num;
        this.options_count = builder.options_count;
        this.is_polled = builder.is_polled;
        this.polled_value = builder.polled_value;
        this.tips = builder.tips;
        this.end_time = builder.end_time;
        this.options = Message.immutableCopyOf(builder.options);
        this.status = builder.status;
        this.total_poll = builder.total_poll;
        this.title = builder.title;
        this.last_time = builder.last_time;
    }
}
