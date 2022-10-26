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
public final class NewParrScores extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_I_TOTAL;
    public static final Long DEFAULT_SCORES_TOTAL;
    public static final Integer DEFAULT_UPDATE_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long i_total;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long scores_total;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer update_time;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long i_total;
        public Long scores_total;
        public Integer update_time;

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
        public Builder(NewParrScores newParrScores) {
            super(newParrScores);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {newParrScores};
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
            if (newParrScores == null) {
                return;
            }
            this.scores_total = newParrScores.scores_total;
            this.update_time = newParrScores.update_time;
            this.i_total = newParrScores.i_total;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewParrScores build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new NewParrScores(this, z, null);
            }
            return (NewParrScores) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-2128087885, "Ltbclient/NewParrScores;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-2128087885, "Ltbclient/NewParrScores;");
                return;
            }
        }
        DEFAULT_SCORES_TOTAL = 0L;
        DEFAULT_UPDATE_TIME = 0;
        DEFAULT_I_TOTAL = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewParrScores(Builder builder, boolean z) {
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
            Long l = builder.scores_total;
            if (l == null) {
                this.scores_total = DEFAULT_SCORES_TOTAL;
            } else {
                this.scores_total = l;
            }
            Integer num = builder.update_time;
            if (num == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num;
            }
            Long l2 = builder.i_total;
            if (l2 == null) {
                this.i_total = DEFAULT_I_TOTAL;
                return;
            } else {
                this.i_total = l2;
                return;
            }
        }
        this.scores_total = builder.scores_total;
        this.update_time = builder.update_time;
        this.i_total = builder.i_total;
    }

    public /* synthetic */ NewParrScores(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
