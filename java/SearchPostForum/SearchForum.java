package tbclient.SearchPostForum;

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
import tbclient.FrsTabInfo;
/* loaded from: classes9.dex */
public final class SearchForum extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_CONCERN_NUM = "";
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_HAS_CONCERNED;
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_POST_NUM = "";
    public static final String DEFAULT_SLOGAN = "";
    public static final List<FrsTabInfo> DEFAULT_TAB_INFO;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String concern_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer has_concerned;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String post_num;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String slogan;
    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<FrsTabInfo> tab_info;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SearchForum> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String avatar;
        public String concern_num;
        public Long forum_id;
        public String forum_name;
        public Integer has_concerned;
        public String intro;
        public String post_num;
        public String slogan;
        public List<FrsTabInfo> tab_info;

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
        public Builder(SearchForum searchForum) {
            super(searchForum);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {searchForum};
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
            if (searchForum == null) {
                return;
            }
            this.forum_id = searchForum.forum_id;
            this.forum_name = searchForum.forum_name;
            this.avatar = searchForum.avatar;
            this.post_num = searchForum.post_num;
            this.concern_num = searchForum.concern_num;
            this.slogan = searchForum.slogan;
            this.intro = searchForum.intro;
            this.has_concerned = searchForum.has_concerned;
            this.tab_info = Message.copyOf(searchForum.tab_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SearchForum build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new SearchForum(this, z, null);
            }
            return (SearchForum) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-610670654, "Ltbclient/SearchPostForum/SearchForum;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-610670654, "Ltbclient/SearchPostForum/SearchForum;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_HAS_CONCERNED = 0;
        DEFAULT_TAB_INFO = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchForum(Builder builder, boolean z) {
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
            String str3 = builder.post_num;
            if (str3 == null) {
                this.post_num = "";
            } else {
                this.post_num = str3;
            }
            String str4 = builder.concern_num;
            if (str4 == null) {
                this.concern_num = "";
            } else {
                this.concern_num = str4;
            }
            String str5 = builder.slogan;
            if (str5 == null) {
                this.slogan = "";
            } else {
                this.slogan = str5;
            }
            String str6 = builder.intro;
            if (str6 == null) {
                this.intro = "";
            } else {
                this.intro = str6;
            }
            Integer num = builder.has_concerned;
            if (num == null) {
                this.has_concerned = DEFAULT_HAS_CONCERNED;
            } else {
                this.has_concerned = num;
            }
            List<FrsTabInfo> list = builder.tab_info;
            if (list == null) {
                this.tab_info = DEFAULT_TAB_INFO;
                return;
            } else {
                this.tab_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.post_num = builder.post_num;
        this.concern_num = builder.concern_num;
        this.slogan = builder.slogan;
        this.intro = builder.intro;
        this.has_concerned = builder.has_concerned;
        this.tab_info = Message.immutableCopyOf(builder.tab_info);
    }

    public /* synthetic */ SearchForum(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
