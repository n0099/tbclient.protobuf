package tbclient.ForumRecommend;

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
import tbclient.BlockPopInfo;
import tbclient.FrsTabInfo;
import tbclient.PrivateForumInfo;
import tbclient.ThemeColorInfo;
/* loaded from: classes9.dex */
public final class LikeForum extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_CONCERN_NUM = "";
    public static final String DEFAULT_CONTENT = "";
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_HAS_CONCERNED = "";
    public static final Long DEFAULT_HOT_THREAD_ID;
    public static final Integer DEFAULT_IS_BRAND_FORUM;
    public static final Integer DEFAULT_IS_LIVEFORUM;
    public static final Integer DEFAULT_IS_MANAGER;
    public static final Integer DEFAULT_IS_PRIVATE_FORUM;
    public static final Integer DEFAULT_IS_SIGN;
    public static final Integer DEFAULT_IS_TOP;
    public static final Integer DEFAULT_LEVEL_ID;
    public static final Boolean DEFAULT_NEED_TRANS;
    public static final Integer DEFAULT_SORT_TYPE;
    public static final List<FrsTabInfo> DEFAULT_TAB_INFO;
    public static final String DEFAULT_THREAD_NUM = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 25)
    public final BlockPopInfo block_pop_info;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String concern_num;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String has_concerned;
    @ProtoField(tag = 20, type = Message.Datatype.INT64)
    public final Long hot_thread_id;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_brand_forum;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_liveforum;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer is_manager;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer is_private_forum;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_sign;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_top;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer level_id;
    @ProtoField(tag = 14, type = Message.Datatype.BOOL)
    public final Boolean need_trans;
    @ProtoField(tag = 19)
    public final PrivateForumInfo private_forum_info;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer sort_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 21)
    public final List<FrsTabInfo> tab_info;
    @ProtoField(tag = 12)
    public final ThemeColorInfo theme_color;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String thread_num;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LikeForum> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String avatar;
        public BlockPopInfo block_pop_info;
        public String concern_num;
        public String content;
        public Long forum_id;
        public String forum_name;
        public String has_concerned;
        public Long hot_thread_id;
        public Integer is_brand_forum;
        public Integer is_liveforum;
        public Integer is_manager;
        public Integer is_private_forum;
        public Integer is_sign;
        public Integer is_top;
        public Integer level_id;
        public Boolean need_trans;
        public PrivateForumInfo private_forum_info;
        public Integer sort_type;
        public List<FrsTabInfo> tab_info;
        public ThemeColorInfo theme_color;
        public String thread_num;

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
        public Builder(LikeForum likeForum) {
            super(likeForum);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {likeForum};
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
            if (likeForum == null) {
                return;
            }
            this.forum_id = likeForum.forum_id;
            this.forum_name = likeForum.forum_name;
            this.avatar = likeForum.avatar;
            this.is_sign = likeForum.is_sign;
            this.level_id = likeForum.level_id;
            this.is_liveforum = likeForum.is_liveforum;
            this.is_brand_forum = likeForum.is_brand_forum;
            this.content = likeForum.content;
            this.is_top = likeForum.is_top;
            this.sort_type = likeForum.sort_type;
            this.theme_color = likeForum.theme_color;
            this.need_trans = likeForum.need_trans;
            this.is_private_forum = likeForum.is_private_forum;
            this.is_manager = likeForum.is_manager;
            this.private_forum_info = likeForum.private_forum_info;
            this.hot_thread_id = likeForum.hot_thread_id;
            this.tab_info = Message.copyOf(likeForum.tab_info);
            this.concern_num = likeForum.concern_num;
            this.thread_num = likeForum.thread_num;
            this.has_concerned = likeForum.has_concerned;
            this.block_pop_info = likeForum.block_pop_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LikeForum build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new LikeForum(this, z, null);
            }
            return (LikeForum) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1017200155, "Ltbclient/ForumRecommend/LikeForum;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1017200155, "Ltbclient/ForumRecommend/LikeForum;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_IS_SIGN = 0;
        DEFAULT_LEVEL_ID = 0;
        DEFAULT_IS_LIVEFORUM = 0;
        DEFAULT_IS_BRAND_FORUM = 0;
        DEFAULT_IS_TOP = 0;
        DEFAULT_SORT_TYPE = 0;
        DEFAULT_NEED_TRANS = Boolean.FALSE;
        DEFAULT_IS_PRIVATE_FORUM = 0;
        DEFAULT_IS_MANAGER = 0;
        DEFAULT_HOT_THREAD_ID = 0L;
        DEFAULT_TAB_INFO = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LikeForum(Builder builder, boolean z) {
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Integer num = builder.is_sign;
            if (num == null) {
                this.is_sign = DEFAULT_IS_SIGN;
            } else {
                this.is_sign = num;
            }
            Integer num2 = builder.level_id;
            if (num2 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num2;
            }
            Integer num3 = builder.is_liveforum;
            if (num3 == null) {
                this.is_liveforum = DEFAULT_IS_LIVEFORUM;
            } else {
                this.is_liveforum = num3;
            }
            Integer num4 = builder.is_brand_forum;
            if (num4 == null) {
                this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
            } else {
                this.is_brand_forum = num4;
            }
            String str3 = builder.content;
            if (str3 == null) {
                this.content = "";
            } else {
                this.content = str3;
            }
            Integer num5 = builder.is_top;
            if (num5 == null) {
                this.is_top = DEFAULT_IS_TOP;
            } else {
                this.is_top = num5;
            }
            Integer num6 = builder.sort_type;
            if (num6 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = num6;
            }
            this.theme_color = builder.theme_color;
            Boolean bool = builder.need_trans;
            if (bool == null) {
                this.need_trans = DEFAULT_NEED_TRANS;
            } else {
                this.need_trans = bool;
            }
            Integer num7 = builder.is_private_forum;
            if (num7 == null) {
                this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
            } else {
                this.is_private_forum = num7;
            }
            Integer num8 = builder.is_manager;
            if (num8 == null) {
                this.is_manager = DEFAULT_IS_MANAGER;
            } else {
                this.is_manager = num8;
            }
            this.private_forum_info = builder.private_forum_info;
            Long l2 = builder.hot_thread_id;
            if (l2 == null) {
                this.hot_thread_id = DEFAULT_HOT_THREAD_ID;
            } else {
                this.hot_thread_id = l2;
            }
            List<FrsTabInfo> list = builder.tab_info;
            if (list == null) {
                this.tab_info = DEFAULT_TAB_INFO;
            } else {
                this.tab_info = Message.immutableCopyOf(list);
            }
            String str4 = builder.concern_num;
            if (str4 == null) {
                this.concern_num = "";
            } else {
                this.concern_num = str4;
            }
            String str5 = builder.thread_num;
            if (str5 == null) {
                this.thread_num = "";
            } else {
                this.thread_num = str5;
            }
            String str6 = builder.has_concerned;
            if (str6 == null) {
                this.has_concerned = "";
            } else {
                this.has_concerned = str6;
            }
            this.block_pop_info = builder.block_pop_info;
            return;
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.is_sign = builder.is_sign;
        this.level_id = builder.level_id;
        this.is_liveforum = builder.is_liveforum;
        this.is_brand_forum = builder.is_brand_forum;
        this.content = builder.content;
        this.is_top = builder.is_top;
        this.sort_type = builder.sort_type;
        this.theme_color = builder.theme_color;
        this.need_trans = builder.need_trans;
        this.is_private_forum = builder.is_private_forum;
        this.is_manager = builder.is_manager;
        this.private_forum_info = builder.private_forum_info;
        this.hot_thread_id = builder.hot_thread_id;
        this.tab_info = Message.immutableCopyOf(builder.tab_info);
        this.concern_num = builder.concern_num;
        this.thread_num = builder.thread_num;
        this.has_concerned = builder.has_concerned;
        this.block_pop_info = builder.block_pop_info;
    }

    public /* synthetic */ LikeForum(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
