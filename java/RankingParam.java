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
/* loaded from: classes3.dex */
public final class RankingParam extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_PN;
    public static final Integer DEFAULT_RANK_CODE;
    public static final Integer DEFAULT_RANK_TYPE;
    public static final Integer DEFAULT_RN;
    public static final String DEFAULT_SORT_TYPE = "";
    public static final Integer DEFAULT_TAB_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer rank_code;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer rank_type;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String sort_type;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer tab_id;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<RankingParam> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer pn;
        public Integer rank_code;
        public Integer rank_type;
        public Integer rn;
        public String sort_type;
        public Integer tab_id;

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
        public Builder(RankingParam rankingParam) {
            super(rankingParam);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {rankingParam};
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
            if (rankingParam == null) {
                return;
            }
            this.rank_type = rankingParam.rank_type;
            this.rank_code = rankingParam.rank_code;
            this.sort_type = rankingParam.sort_type;
            this.tab_id = rankingParam.tab_id;
            this.pn = rankingParam.pn;
            this.rn = rankingParam.rn;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RankingParam build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new RankingParam(this, z, null) : (RankingParam) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1657169018, "Ltbclient/RankingParam;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1657169018, "Ltbclient/RankingParam;");
                return;
            }
        }
        DEFAULT_RANK_TYPE = 0;
        DEFAULT_RANK_CODE = 0;
        DEFAULT_TAB_ID = 0;
        DEFAULT_PN = 0;
        DEFAULT_RN = 0;
    }

    public /* synthetic */ RankingParam(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankingParam(Builder builder, boolean z) {
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
            Integer num = builder.rank_type;
            if (num == null) {
                this.rank_type = DEFAULT_RANK_TYPE;
            } else {
                this.rank_type = num;
            }
            Integer num2 = builder.rank_code;
            if (num2 == null) {
                this.rank_code = DEFAULT_RANK_CODE;
            } else {
                this.rank_code = num2;
            }
            String str = builder.sort_type;
            if (str == null) {
                this.sort_type = "";
            } else {
                this.sort_type = str;
            }
            Integer num3 = builder.tab_id;
            if (num3 == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num3;
            }
            Integer num4 = builder.pn;
            if (num4 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num4;
            }
            Integer num5 = builder.rn;
            if (num5 == null) {
                this.rn = DEFAULT_RN;
                return;
            } else {
                this.rn = num5;
                return;
            }
        }
        this.rank_type = builder.rank_type;
        this.rank_code = builder.rank_code;
        this.sort_type = builder.sort_type;
        this.tab_id = builder.tab_id;
        this.pn = builder.pn;
        this.rn = builder.rn;
    }
}
