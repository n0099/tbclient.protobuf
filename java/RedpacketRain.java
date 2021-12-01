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
public final class RedpacketRain extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACTIVITY_ID = "";
    public static final List<String> DEFAULT_DYNAMIC_IMG;
    public static final Long DEFAULT_END_TIME;
    public static final String DEFAULT_FLOAT_URL = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final Integer DEFAULT_SHOW_TYPE;
    public static final Long DEFAULT_START_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String activity_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> dynamic_img;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long end_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String float_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer show_type;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long start_time;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<RedpacketRain> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String activity_id;
        public List<String> dynamic_img;
        public Long end_time;
        public String float_url;
        public String jump_url;
        public Integer show_type;
        public Long start_time;

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
        public Builder(RedpacketRain redpacketRain) {
            super(redpacketRain);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {redpacketRain};
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
            if (redpacketRain == null) {
                return;
            }
            this.start_time = redpacketRain.start_time;
            this.end_time = redpacketRain.end_time;
            this.jump_url = redpacketRain.jump_url;
            this.float_url = redpacketRain.float_url;
            this.dynamic_img = Message.copyOf(redpacketRain.dynamic_img);
            this.activity_id = redpacketRain.activity_id;
            this.show_type = redpacketRain.show_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RedpacketRain build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new RedpacketRain(this, z, null) : (RedpacketRain) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1601022392, "Ltbclient/RedpacketRain;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1601022392, "Ltbclient/RedpacketRain;");
                return;
            }
        }
        DEFAULT_START_TIME = 0L;
        DEFAULT_END_TIME = 0L;
        DEFAULT_DYNAMIC_IMG = Collections.emptyList();
        DEFAULT_SHOW_TYPE = 0;
    }

    public /* synthetic */ RedpacketRain(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedpacketRain(Builder builder, boolean z) {
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
            Long l = builder.start_time;
            if (l == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = l;
            }
            Long l2 = builder.end_time;
            if (l2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = l2;
            }
            String str = builder.jump_url;
            if (str == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str;
            }
            String str2 = builder.float_url;
            if (str2 == null) {
                this.float_url = "";
            } else {
                this.float_url = str2;
            }
            List<String> list = builder.dynamic_img;
            if (list == null) {
                this.dynamic_img = DEFAULT_DYNAMIC_IMG;
            } else {
                this.dynamic_img = Message.immutableCopyOf(list);
            }
            String str3 = builder.activity_id;
            if (str3 == null) {
                this.activity_id = "";
            } else {
                this.activity_id = str3;
            }
            Integer num = builder.show_type;
            if (num == null) {
                this.show_type = DEFAULT_SHOW_TYPE;
                return;
            } else {
                this.show_type = num;
                return;
            }
        }
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.jump_url = builder.jump_url;
        this.float_url = builder.float_url;
        this.dynamic_img = Message.immutableCopyOf(builder.dynamic_img);
        this.activity_id = builder.activity_id;
        this.show_type = builder.show_type;
    }
}
