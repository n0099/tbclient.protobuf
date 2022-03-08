package tbclient.Search;

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
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_AGREE_NUM;
    public static final Long DEFAULT_APPLY_ID;
    public static final Integer DEFAULT_FORUM_LEVEL;
    public static final Boolean DEFAULT_IS_VOTE;
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_POST_NUM;
    public static final Integer DEFAULT_THREAD_NUM;
    public static final Long DEFAULT_TID;
    public static final Long DEFAULT_UID;
    public static final Integer DEFAULT_VOTE_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer agree_num;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long apply_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer forum_level;
    @ProtoField(tag = 5, type = Message.Datatype.BOOL)
    public final Boolean is_vote;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer post_num;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer thread_num;
    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer vote_num;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer agree_num;
        public Long apply_id;
        public Integer forum_level;
        public Boolean is_vote;
        public String name_show;
        public String portrait;
        public Integer post_num;
        public Integer thread_num;
        public Long tid;
        public Long uid;
        public Integer vote_num;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.uid = dataRes.uid;
            this.portrait = dataRes.portrait;
            this.name_show = dataRes.name_show;
            this.vote_num = dataRes.vote_num;
            this.is_vote = dataRes.is_vote;
            this.forum_level = dataRes.forum_level;
            this.agree_num = dataRes.agree_num;
            this.thread_num = dataRes.thread_num;
            this.post_num = dataRes.post_num;
            this.apply_id = dataRes.apply_id;
            this.tid = dataRes.tid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1141427426, "Ltbclient/Search/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1141427426, "Ltbclient/Search/DataRes;");
                return;
            }
        }
        DEFAULT_UID = 0L;
        DEFAULT_VOTE_NUM = 0;
        DEFAULT_IS_VOTE = Boolean.FALSE;
        DEFAULT_FORUM_LEVEL = 0;
        DEFAULT_AGREE_NUM = 0;
        DEFAULT_THREAD_NUM = 0;
        DEFAULT_POST_NUM = 0;
        DEFAULT_APPLY_ID = 0L;
        DEFAULT_TID = 0L;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
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
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            String str2 = builder.name_show;
            if (str2 == null) {
                this.name_show = "";
            } else {
                this.name_show = str2;
            }
            Integer num = builder.vote_num;
            if (num == null) {
                this.vote_num = DEFAULT_VOTE_NUM;
            } else {
                this.vote_num = num;
            }
            Boolean bool = builder.is_vote;
            if (bool == null) {
                this.is_vote = DEFAULT_IS_VOTE;
            } else {
                this.is_vote = bool;
            }
            Integer num2 = builder.forum_level;
            if (num2 == null) {
                this.forum_level = DEFAULT_FORUM_LEVEL;
            } else {
                this.forum_level = num2;
            }
            Integer num3 = builder.agree_num;
            if (num3 == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = num3;
            }
            Integer num4 = builder.thread_num;
            if (num4 == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
            } else {
                this.thread_num = num4;
            }
            Integer num5 = builder.post_num;
            if (num5 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num5;
            }
            Long l2 = builder.apply_id;
            if (l2 == null) {
                this.apply_id = DEFAULT_APPLY_ID;
            } else {
                this.apply_id = l2;
            }
            Long l3 = builder.tid;
            if (l3 == null) {
                this.tid = DEFAULT_TID;
                return;
            } else {
                this.tid = l3;
                return;
            }
        }
        this.uid = builder.uid;
        this.portrait = builder.portrait;
        this.name_show = builder.name_show;
        this.vote_num = builder.vote_num;
        this.is_vote = builder.is_vote;
        this.forum_level = builder.forum_level;
        this.agree_num = builder.agree_num;
        this.thread_num = builder.thread_num;
        this.post_num = builder.post_num;
        this.apply_id = builder.apply_id;
        this.tid = builder.tid;
    }
}
