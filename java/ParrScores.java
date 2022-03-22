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
/* loaded from: classes8.dex */
public final class ParrScores extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_I_MONEY;
    public static final Long DEFAULT_I_OTHER;
    public static final Long DEFAULT_I_TOTAL;
    public static final Integer DEFAULT_LEVEL;
    public static final Integer DEFAULT_LIMIT;
    public static final Integer DEFAULT_SCORES_FETCH;
    public static final Integer DEFAULT_SCORES_MONEY;
    public static final Integer DEFAULT_SCORES_OTHER;
    public static final Integer DEFAULT_SCORES_TOTAL;
    public static final Integer DEFAULT_UPDATE_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long i_money;
    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long i_other;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long i_total;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer level;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer limit;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer scores_fetch;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer scores_money;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer scores_other;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer scores_total;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer update_time;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ParrScores> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long i_money;
        public Long i_other;
        public Long i_total;
        public Integer level;
        public Integer limit;
        public Integer scores_fetch;
        public Integer scores_money;
        public Integer scores_other;
        public Integer scores_total;
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
        public Builder(ParrScores parrScores) {
            super(parrScores);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {parrScores};
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
            if (parrScores == null) {
                return;
            }
            this.scores_total = parrScores.scores_total;
            this.scores_fetch = parrScores.scores_fetch;
            this.scores_money = parrScores.scores_money;
            this.scores_other = parrScores.scores_other;
            this.update_time = parrScores.update_time;
            this.level = parrScores.level;
            this.limit = parrScores.limit;
            this.i_total = parrScores.i_total;
            this.i_money = parrScores.i_money;
            this.i_other = parrScores.i_other;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ParrScores build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ParrScores(this, z, null) : (ParrScores) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(850072543, "Ltbclient/ParrScores;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(850072543, "Ltbclient/ParrScores;");
                return;
            }
        }
        DEFAULT_SCORES_TOTAL = 0;
        DEFAULT_SCORES_FETCH = 0;
        DEFAULT_SCORES_MONEY = 0;
        DEFAULT_SCORES_OTHER = 0;
        DEFAULT_UPDATE_TIME = 0;
        DEFAULT_LEVEL = 0;
        DEFAULT_LIMIT = 0;
        DEFAULT_I_TOTAL = 0L;
        DEFAULT_I_MONEY = 0L;
        DEFAULT_I_OTHER = 0L;
    }

    public /* synthetic */ ParrScores(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParrScores(Builder builder, boolean z) {
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
            Integer num = builder.scores_total;
            if (num == null) {
                this.scores_total = DEFAULT_SCORES_TOTAL;
            } else {
                this.scores_total = num;
            }
            Integer num2 = builder.scores_fetch;
            if (num2 == null) {
                this.scores_fetch = DEFAULT_SCORES_FETCH;
            } else {
                this.scores_fetch = num2;
            }
            Integer num3 = builder.scores_money;
            if (num3 == null) {
                this.scores_money = DEFAULT_SCORES_MONEY;
            } else {
                this.scores_money = num3;
            }
            Integer num4 = builder.scores_other;
            if (num4 == null) {
                this.scores_other = DEFAULT_SCORES_OTHER;
            } else {
                this.scores_other = num4;
            }
            Integer num5 = builder.update_time;
            if (num5 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num5;
            }
            Integer num6 = builder.level;
            if (num6 == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = num6;
            }
            Integer num7 = builder.limit;
            if (num7 == null) {
                this.limit = DEFAULT_LIMIT;
            } else {
                this.limit = num7;
            }
            Long l = builder.i_total;
            if (l == null) {
                this.i_total = DEFAULT_I_TOTAL;
            } else {
                this.i_total = l;
            }
            Long l2 = builder.i_money;
            if (l2 == null) {
                this.i_money = DEFAULT_I_MONEY;
            } else {
                this.i_money = l2;
            }
            Long l3 = builder.i_other;
            if (l3 == null) {
                this.i_other = DEFAULT_I_OTHER;
                return;
            } else {
                this.i_other = l3;
                return;
            }
        }
        this.scores_total = builder.scores_total;
        this.scores_fetch = builder.scores_fetch;
        this.scores_money = builder.scores_money;
        this.scores_other = builder.scores_other;
        this.update_time = builder.update_time;
        this.level = builder.level;
        this.limit = builder.limit;
        this.i_total = builder.i_total;
        this.i_money = builder.i_money;
        this.i_other = builder.i_other;
    }
}
