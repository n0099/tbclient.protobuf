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
/* loaded from: classes9.dex */
public final class CreationData extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_AGREE_COUNT;
    public static final Integer DEFAULT_AGREE_COUNT_TREND;
    public static final Integer DEFAULT_VIEW_COUNT;
    public static final Integer DEFAULT_VIEW_COUNT_TREND;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer agree_count;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer agree_count_trend;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer view_count;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer view_count_trend;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<CreationData> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer agree_count;
        public Integer agree_count_trend;
        public Integer view_count;
        public Integer view_count_trend;

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
        public Builder(CreationData creationData) {
            super(creationData);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {creationData};
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
            if (creationData == null) {
                return;
            }
            this.view_count = creationData.view_count;
            this.agree_count = creationData.agree_count;
            this.view_count_trend = creationData.view_count_trend;
            this.agree_count_trend = creationData.agree_count_trend;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CreationData build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new CreationData(this, z, null) : (CreationData) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1430932872, "Ltbclient/CreationData;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1430932872, "Ltbclient/CreationData;");
                return;
            }
        }
        DEFAULT_VIEW_COUNT = 0;
        DEFAULT_AGREE_COUNT = 0;
        DEFAULT_VIEW_COUNT_TREND = 0;
        DEFAULT_AGREE_COUNT_TREND = 0;
    }

    public /* synthetic */ CreationData(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreationData(Builder builder, boolean z) {
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
            Integer num = builder.view_count;
            if (num == null) {
                this.view_count = DEFAULT_VIEW_COUNT;
            } else {
                this.view_count = num;
            }
            Integer num2 = builder.agree_count;
            if (num2 == null) {
                this.agree_count = DEFAULT_AGREE_COUNT;
            } else {
                this.agree_count = num2;
            }
            Integer num3 = builder.view_count_trend;
            if (num3 == null) {
                this.view_count_trend = DEFAULT_VIEW_COUNT_TREND;
            } else {
                this.view_count_trend = num3;
            }
            Integer num4 = builder.agree_count_trend;
            if (num4 == null) {
                this.agree_count_trend = DEFAULT_AGREE_COUNT_TREND;
                return;
            } else {
                this.agree_count_trend = num4;
                return;
            }
        }
        this.view_count = builder.view_count;
        this.agree_count = builder.agree_count;
        this.view_count_trend = builder.view_count_trend;
        this.agree_count_trend = builder.agree_count_trend;
    }
}
