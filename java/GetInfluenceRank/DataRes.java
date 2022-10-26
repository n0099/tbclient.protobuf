package tbclient.GetInfluenceRank;

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
import tbclient.RankRuler;
import tbclient.TiebaFieldsInfo;
import tbclient.User;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Boolean DEFAULT_HAS_MORE;
    public static final Long DEFAULT_TIMESTAMP;
    public static final List<User> DEFAULT_USER_RANK;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2)
    public final User current_user;
    @ProtoField(tag = 3)
    public final TiebaFieldsInfo field_info;
    @ProtoField(tag = 6, type = Message.Datatype.BOOL)
    public final Boolean has_more;
    @ProtoField(tag = 4)
    public final RankRuler rank_description;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long timestamp;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> user_rank;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public User current_user;
        public TiebaFieldsInfo field_info;
        public Boolean has_more;
        public RankRuler rank_description;
        public Long timestamp;
        public List user_rank;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.user_rank = Message.copyOf(dataRes.user_rank);
            this.current_user = dataRes.current_user;
            this.field_info = dataRes.field_info;
            this.rank_description = dataRes.rank_description;
            this.timestamp = dataRes.timestamp;
            this.has_more = dataRes.has_more;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DataRes(this, z, null);
            }
            return (DataRes) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1219781983, "Ltbclient/GetInfluenceRank/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1219781983, "Ltbclient/GetInfluenceRank/DataRes;");
                return;
            }
        }
        DEFAULT_USER_RANK = Collections.emptyList();
        DEFAULT_TIMESTAMP = 0L;
        DEFAULT_HAS_MORE = Boolean.FALSE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            List list = builder.user_rank;
            if (list == null) {
                this.user_rank = DEFAULT_USER_RANK;
            } else {
                this.user_rank = Message.immutableCopyOf(list);
            }
            this.current_user = builder.current_user;
            this.field_info = builder.field_info;
            this.rank_description = builder.rank_description;
            Long l = builder.timestamp;
            if (l == null) {
                this.timestamp = DEFAULT_TIMESTAMP;
            } else {
                this.timestamp = l;
            }
            Boolean bool = builder.has_more;
            if (bool == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = bool;
                return;
            }
        }
        this.user_rank = Message.immutableCopyOf(builder.user_rank);
        this.current_user = builder.current_user;
        this.field_info = builder.field_info;
        this.rank_description = builder.rank_description;
        this.timestamp = builder.timestamp;
        this.has_more = builder.has_more;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
