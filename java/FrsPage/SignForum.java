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
/* loaded from: classes8.dex */
public final class SignForum extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_FORUM_ID;
    public static final Integer DEFAULT_IS_FILTER;
    public static final Integer DEFAULT_IS_ON;
    public static final String DEFAULT_LEVEL1_DIR_NAME = "";
    public static final String DEFAULT_LEVEL2_DIR_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4)
    public final RankInfo current_rank_info;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 3)
    public final Forum forum_info;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_filter;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_on;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String level1_dir_name;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String level2_dir_name;
    @ProtoField(tag = 9)
    public final RankInfo monthly_rank_info;
    @ProtoField(tag = 6)
    public final RankInfo weekly_rank_info;
    @ProtoField(tag = 5)
    public final RankInfo yesterday_rank_info;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<SignForum> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public RankInfo current_rank_info;
        public Long forum_id;
        public Forum forum_info;
        public Integer is_filter;
        public Integer is_on;
        public String level1_dir_name;
        public String level2_dir_name;
        public RankInfo monthly_rank_info;
        public RankInfo weekly_rank_info;
        public RankInfo yesterday_rank_info;

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
        public Builder(SignForum signForum) {
            super(signForum);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {signForum};
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
            if (signForum == null) {
                return;
            }
            this.is_on = signForum.is_on;
            this.is_filter = signForum.is_filter;
            this.forum_info = signForum.forum_info;
            this.current_rank_info = signForum.current_rank_info;
            this.yesterday_rank_info = signForum.yesterday_rank_info;
            this.weekly_rank_info = signForum.weekly_rank_info;
            this.level1_dir_name = signForum.level1_dir_name;
            this.level2_dir_name = signForum.level2_dir_name;
            this.monthly_rank_info = signForum.monthly_rank_info;
            this.forum_id = signForum.forum_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignForum build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SignForum(this, z, null) : (SignForum) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1164186938, "Ltbclient/FrsPage/SignForum;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1164186938, "Ltbclient/FrsPage/SignForum;");
                return;
            }
        }
        DEFAULT_IS_ON = 0;
        DEFAULT_IS_FILTER = 0;
        DEFAULT_FORUM_ID = 0L;
    }

    public /* synthetic */ SignForum(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignForum(Builder builder, boolean z) {
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
            Integer num = builder.is_on;
            if (num == null) {
                this.is_on = DEFAULT_IS_ON;
            } else {
                this.is_on = num;
            }
            Integer num2 = builder.is_filter;
            if (num2 == null) {
                this.is_filter = DEFAULT_IS_FILTER;
            } else {
                this.is_filter = num2;
            }
            this.forum_info = builder.forum_info;
            this.current_rank_info = builder.current_rank_info;
            this.yesterday_rank_info = builder.yesterday_rank_info;
            this.weekly_rank_info = builder.weekly_rank_info;
            String str = builder.level1_dir_name;
            if (str == null) {
                this.level1_dir_name = "";
            } else {
                this.level1_dir_name = str;
            }
            String str2 = builder.level2_dir_name;
            if (str2 == null) {
                this.level2_dir_name = "";
            } else {
                this.level2_dir_name = str2;
            }
            this.monthly_rank_info = builder.monthly_rank_info;
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = l;
                return;
            }
        }
        this.is_on = builder.is_on;
        this.is_filter = builder.is_filter;
        this.forum_info = builder.forum_info;
        this.current_rank_info = builder.current_rank_info;
        this.yesterday_rank_info = builder.yesterday_rank_info;
        this.weekly_rank_info = builder.weekly_rank_info;
        this.level1_dir_name = builder.level1_dir_name;
        this.level2_dir_name = builder.level2_dir_name;
        this.monthly_rank_info = builder.monthly_rank_info;
        this.forum_id = builder.forum_id;
    }
}
