package tbclient.HomePage;

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
public final class HotOfficialForumItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_FORUM_AVATOR = "";
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_IS_LIKED;
    public static final Integer DEFAULT_IS_OFFICIAL;
    public static final Integer DEFAULT_IS_SHOW_VICON;
    public static final Long DEFAULT_LIKED_NUM;
    public static final Long DEFAULT_POST_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_avator;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_liked;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_official;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_show_vicon;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long liked_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long post_num;
    @ProtoField(tag = 9)
    public final HotOfficialThread recommend_thread;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<HotOfficialForumItem> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String forum_avator;
        public Long forum_id;
        public String forum_name;
        public Integer is_liked;
        public Integer is_official;
        public Integer is_show_vicon;
        public Long liked_num;
        public Long post_num;
        public HotOfficialThread recommend_thread;

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
        public Builder(HotOfficialForumItem hotOfficialForumItem) {
            super(hotOfficialForumItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {hotOfficialForumItem};
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
            if (hotOfficialForumItem == null) {
                return;
            }
            this.forum_id = hotOfficialForumItem.forum_id;
            this.forum_name = hotOfficialForumItem.forum_name;
            this.forum_avator = hotOfficialForumItem.forum_avator;
            this.liked_num = hotOfficialForumItem.liked_num;
            this.post_num = hotOfficialForumItem.post_num;
            this.is_liked = hotOfficialForumItem.is_liked;
            this.is_official = hotOfficialForumItem.is_official;
            this.is_show_vicon = hotOfficialForumItem.is_show_vicon;
            this.recommend_thread = hotOfficialForumItem.recommend_thread;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotOfficialForumItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new HotOfficialForumItem(this, z, null);
            }
            return (HotOfficialForumItem) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-395929752, "Ltbclient/HomePage/HotOfficialForumItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-395929752, "Ltbclient/HomePage/HotOfficialForumItem;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_LIKED_NUM = 0L;
        DEFAULT_POST_NUM = 0L;
        DEFAULT_IS_LIKED = 0;
        DEFAULT_IS_OFFICIAL = 0;
        DEFAULT_IS_SHOW_VICON = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotOfficialForumItem(Builder builder, boolean z) {
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
            String str2 = builder.forum_avator;
            if (str2 == null) {
                this.forum_avator = "";
            } else {
                this.forum_avator = str2;
            }
            Long l2 = builder.liked_num;
            if (l2 == null) {
                this.liked_num = DEFAULT_LIKED_NUM;
            } else {
                this.liked_num = l2;
            }
            Long l3 = builder.post_num;
            if (l3 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = l3;
            }
            Integer num = builder.is_liked;
            if (num == null) {
                this.is_liked = DEFAULT_IS_LIKED;
            } else {
                this.is_liked = num;
            }
            Integer num2 = builder.is_official;
            if (num2 == null) {
                this.is_official = DEFAULT_IS_OFFICIAL;
            } else {
                this.is_official = num2;
            }
            Integer num3 = builder.is_show_vicon;
            if (num3 == null) {
                this.is_show_vicon = DEFAULT_IS_SHOW_VICON;
            } else {
                this.is_show_vicon = num3;
            }
            this.recommend_thread = builder.recommend_thread;
            return;
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.forum_avator = builder.forum_avator;
        this.liked_num = builder.liked_num;
        this.post_num = builder.post_num;
        this.is_liked = builder.is_liked;
        this.is_official = builder.is_official;
        this.is_show_vicon = builder.is_show_vicon;
        this.recommend_thread = builder.recommend_thread;
    }

    public /* synthetic */ HotOfficialForumItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
