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
public final class BetInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BET = "";
    public static final Integer DEFAULT_NO;
    public static final Long DEFAULT_SCORE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String bet;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer no;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long score;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String bet;
        public Integer no;
        public Long score;

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
        public Builder(BetInfo betInfo) {
            super(betInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {betInfo};
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
            if (betInfo == null) {
                return;
            }
            this.bet = betInfo.bet;
            this.score = betInfo.score;
            this.no = betInfo.no;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BetInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new BetInfo(this, z, null);
            }
            return (BetInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2106033702, "Ltbclient/BetInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2106033702, "Ltbclient/BetInfo;");
                return;
            }
        }
        DEFAULT_SCORE = 0L;
        DEFAULT_NO = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetInfo(Builder builder, boolean z) {
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
            String str = builder.bet;
            if (str == null) {
                this.bet = "";
            } else {
                this.bet = str;
            }
            Long l = builder.score;
            if (l == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = l;
            }
            Integer num = builder.no;
            if (num == null) {
                this.no = DEFAULT_NO;
                return;
            } else {
                this.no = num;
                return;
            }
        }
        this.bet = builder.bet;
        this.score = builder.score;
        this.no = builder.no;
    }

    public /* synthetic */ BetInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
