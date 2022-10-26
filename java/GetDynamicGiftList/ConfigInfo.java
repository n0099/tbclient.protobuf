package tbclient.GetDynamicGiftList;

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
public final class ConfigInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_FRAME_COUNT;
    public static final Integer DEFAULT_FRAME_RATE;
    public static final Double DEFAULT_HEIGHT;
    public static final Integer DEFAULT_IS_BOTTOM_MARGIN;
    public static final Double DEFAULT_OPPOSITE_X;
    public static final Double DEFAULT_OPPOSITE_Y;
    public static final Integer DEFAULT_REPEAT_COUNT;
    public static final Double DEFAULT_USER_INFO_X;
    public static final Double DEFAULT_USER_INFO_Y;
    public static final Double DEFAULT_WIDTH;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer frame_count;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer frame_rate;
    @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
    public final Double height;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_bottom_margin;
    @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
    public final Double opposite_x;
    @ProtoField(tag = 8, type = Message.Datatype.DOUBLE)
    public final Double opposite_y;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer repeat_count;
    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double user_info_x;
    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double user_info_y;
    @ProtoField(tag = 5, type = Message.Datatype.DOUBLE)
    public final Double width;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer frame_count;
        public Integer frame_rate;
        public Double height;
        public Integer is_bottom_margin;
        public Double opposite_x;
        public Double opposite_y;
        public Integer repeat_count;
        public Double user_info_x;
        public Double user_info_y;
        public Double width;

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
        public Builder(ConfigInfo configInfo) {
            super(configInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {configInfo};
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
            if (configInfo == null) {
                return;
            }
            this.frame_rate = configInfo.frame_rate;
            this.frame_count = configInfo.frame_count;
            this.repeat_count = configInfo.repeat_count;
            this.is_bottom_margin = configInfo.is_bottom_margin;
            this.width = configInfo.width;
            this.height = configInfo.height;
            this.opposite_x = configInfo.opposite_x;
            this.opposite_y = configInfo.opposite_y;
            this.user_info_x = configInfo.user_info_x;
            this.user_info_y = configInfo.user_info_y;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConfigInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ConfigInfo(this, z, null);
            }
            return (ConfigInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(85791101, "Ltbclient/GetDynamicGiftList/ConfigInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(85791101, "Ltbclient/GetDynamicGiftList/ConfigInfo;");
                return;
            }
        }
        DEFAULT_FRAME_RATE = 0;
        DEFAULT_FRAME_COUNT = 0;
        DEFAULT_REPEAT_COUNT = 0;
        DEFAULT_IS_BOTTOM_MARGIN = 0;
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_WIDTH = valueOf;
        DEFAULT_HEIGHT = valueOf;
        DEFAULT_OPPOSITE_X = valueOf;
        DEFAULT_OPPOSITE_Y = valueOf;
        DEFAULT_USER_INFO_X = valueOf;
        DEFAULT_USER_INFO_Y = valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigInfo(Builder builder, boolean z) {
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
            Integer num = builder.frame_rate;
            if (num == null) {
                this.frame_rate = DEFAULT_FRAME_RATE;
            } else {
                this.frame_rate = num;
            }
            Integer num2 = builder.frame_count;
            if (num2 == null) {
                this.frame_count = DEFAULT_FRAME_COUNT;
            } else {
                this.frame_count = num2;
            }
            Integer num3 = builder.repeat_count;
            if (num3 == null) {
                this.repeat_count = DEFAULT_REPEAT_COUNT;
            } else {
                this.repeat_count = num3;
            }
            Integer num4 = builder.is_bottom_margin;
            if (num4 == null) {
                this.is_bottom_margin = DEFAULT_IS_BOTTOM_MARGIN;
            } else {
                this.is_bottom_margin = num4;
            }
            Double d = builder.width;
            if (d == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = d;
            }
            Double d2 = builder.height;
            if (d2 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = d2;
            }
            Double d3 = builder.opposite_x;
            if (d3 == null) {
                this.opposite_x = DEFAULT_OPPOSITE_X;
            } else {
                this.opposite_x = d3;
            }
            Double d4 = builder.opposite_y;
            if (d4 == null) {
                this.opposite_y = DEFAULT_OPPOSITE_Y;
            } else {
                this.opposite_y = d4;
            }
            Double d5 = builder.user_info_x;
            if (d5 == null) {
                this.user_info_x = DEFAULT_USER_INFO_X;
            } else {
                this.user_info_x = d5;
            }
            Double d6 = builder.user_info_y;
            if (d6 == null) {
                this.user_info_y = DEFAULT_USER_INFO_Y;
                return;
            } else {
                this.user_info_y = d6;
                return;
            }
        }
        this.frame_rate = builder.frame_rate;
        this.frame_count = builder.frame_count;
        this.repeat_count = builder.repeat_count;
        this.is_bottom_margin = builder.is_bottom_margin;
        this.width = builder.width;
        this.height = builder.height;
        this.opposite_x = builder.opposite_x;
        this.opposite_y = builder.opposite_y;
        this.user_info_x = builder.user_info_x;
        this.user_info_y = builder.user_info_y;
    }

    public /* synthetic */ ConfigInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
