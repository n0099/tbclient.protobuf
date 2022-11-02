package tbclient.FrsPage;

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
public final class RankInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Double DEFAULT_DIR_RATE;
    public static final Integer DEFAULT_MEMBER_COUNT;
    public static final Integer DEFAULT_SIGN_COUNT;
    public static final Integer DEFAULT_SIGN_RANK;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
    public final Double dir_rate;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer member_count;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer sign_count;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer sign_rank;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RankInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Double dir_rate;
        public Integer member_count;
        public Integer sign_count;
        public Integer sign_rank;

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
        public Builder(RankInfo rankInfo) {
            super(rankInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {rankInfo};
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
            if (rankInfo == null) {
                return;
            }
            this.sign_count = rankInfo.sign_count;
            this.sign_rank = rankInfo.sign_rank;
            this.member_count = rankInfo.member_count;
            this.dir_rate = rankInfo.dir_rate;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RankInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new RankInfo(this, z, null);
            }
            return (RankInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-10571202, "Ltbclient/FrsPage/RankInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-10571202, "Ltbclient/FrsPage/RankInfo;");
                return;
            }
        }
        DEFAULT_SIGN_COUNT = 0;
        DEFAULT_SIGN_RANK = 0;
        DEFAULT_MEMBER_COUNT = 0;
        DEFAULT_DIR_RATE = Double.valueOf(0.0d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankInfo(Builder builder, boolean z) {
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
            Integer num = builder.sign_count;
            if (num == null) {
                this.sign_count = DEFAULT_SIGN_COUNT;
            } else {
                this.sign_count = num;
            }
            Integer num2 = builder.sign_rank;
            if (num2 == null) {
                this.sign_rank = DEFAULT_SIGN_RANK;
            } else {
                this.sign_rank = num2;
            }
            Integer num3 = builder.member_count;
            if (num3 == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = num3;
            }
            Double d = builder.dir_rate;
            if (d == null) {
                this.dir_rate = DEFAULT_DIR_RATE;
                return;
            } else {
                this.dir_rate = d;
                return;
            }
        }
        this.sign_count = builder.sign_count;
        this.sign_rank = builder.sign_rank;
        this.member_count = builder.member_count;
        this.dir_rate = builder.dir_rate;
    }

    public /* synthetic */ RankInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
