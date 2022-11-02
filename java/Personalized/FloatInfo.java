package tbclient.Personalized;

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
/* loaded from: classes9.dex */
public final class FloatInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_ACTIVITY_ID;
    public static final List<String> DEFAULT_DYNAMIC_URL;
    public static final Long DEFAULT_END_TIME;
    public static final String DEFAULT_FLOAT_URL = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final Integer DEFAULT_SHOW_TYPE;
    public static final Long DEFAULT_START_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long activity_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
    public final List<String> dynamic_url;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long end_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String float_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer show_type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long start_time;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FloatInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long activity_id;
        public List<String> dynamic_url;
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
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(FloatInfo floatInfo) {
            super(floatInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {floatInfo};
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
            if (floatInfo == null) {
                return;
            }
            this.float_url = floatInfo.float_url;
            this.start_time = floatInfo.start_time;
            this.end_time = floatInfo.end_time;
            this.dynamic_url = Message.copyOf(floatInfo.dynamic_url);
            this.activity_id = floatInfo.activity_id;
            this.jump_url = floatInfo.jump_url;
            this.show_type = floatInfo.show_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FloatInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new FloatInfo(this, z, null);
            }
            return (FloatInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1911567386, "Ltbclient/Personalized/FloatInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1911567386, "Ltbclient/Personalized/FloatInfo;");
                return;
            }
        }
        DEFAULT_START_TIME = 0L;
        DEFAULT_END_TIME = 0L;
        DEFAULT_DYNAMIC_URL = Collections.emptyList();
        DEFAULT_ACTIVITY_ID = 0L;
        DEFAULT_SHOW_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatInfo(Builder builder, boolean z) {
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
            String str = builder.float_url;
            if (str == null) {
                this.float_url = "";
            } else {
                this.float_url = str;
            }
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
            List<String> list = builder.dynamic_url;
            if (list == null) {
                this.dynamic_url = DEFAULT_DYNAMIC_URL;
            } else {
                this.dynamic_url = Message.immutableCopyOf(list);
            }
            Long l3 = builder.activity_id;
            if (l3 == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = l3;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
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
        this.float_url = builder.float_url;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.dynamic_url = Message.immutableCopyOf(builder.dynamic_url);
        this.activity_id = builder.activity_id;
        this.jump_url = builder.jump_url;
        this.show_type = builder.show_type;
    }

    public /* synthetic */ FloatInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
