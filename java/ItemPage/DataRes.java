package tbclient.ItemPage;

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
import tbclient.AlbumElement;
import tbclient.ItemGameInfo;
import tbclient.ItemInfo;
import tbclient.RecommendForumInfo;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<AlbumElement> DEFAULT_ALBUM_LIST;
    public static final Integer DEFAULT_DISCUSSION_ID;
    public static final List<ThreadInfo> DEFAULT_DISCUSSION_LIST;
    public static final String DEFAULT_LINK = "";
    public static final List<RecommendForumInfo> DEFAULT_RECOMMEND_FORUM;
    public static final List<ItemInfo> DEFAULT_RECOMMEND_ITEM;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<AlbumElement> album_list;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer discussion_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ThreadInfo> discussion_list;
    @ProtoField(tag = 9)
    public final ItemGameInfo item_game_info;
    @ProtoField(tag = 1)
    public final ItemInfo item_info;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<RecommendForumInfo> recommend_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ItemInfo> recommend_item;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<AlbumElement> album_list;
        public Integer discussion_id;
        public List<ThreadInfo> discussion_list;
        public ItemGameInfo item_game_info;
        public ItemInfo item_info;
        public String link;
        public List<RecommendForumInfo> recommend_forum;
        public List<ItemInfo> recommend_item;
        public List<ThreadInfo> thread_list;

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
            this.item_info = dataRes.item_info;
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.recommend_item = Message.copyOf(dataRes.recommend_item);
            this.recommend_forum = Message.copyOf(dataRes.recommend_forum);
            this.link = dataRes.link;
            this.album_list = Message.copyOf(dataRes.album_list);
            this.discussion_list = Message.copyOf(dataRes.discussion_list);
            this.discussion_id = dataRes.discussion_id;
            this.item_game_info = dataRes.item_game_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1679610376, "Ltbclient/ItemPage/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1679610376, "Ltbclient/ItemPage/DataRes;");
                return;
            }
        }
        DEFAULT_THREAD_LIST = Collections.emptyList();
        DEFAULT_RECOMMEND_ITEM = Collections.emptyList();
        DEFAULT_RECOMMEND_FORUM = Collections.emptyList();
        DEFAULT_ALBUM_LIST = Collections.emptyList();
        DEFAULT_DISCUSSION_LIST = Collections.emptyList();
        DEFAULT_DISCUSSION_ID = 0;
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
            this.item_info = builder.item_info;
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            List<ItemInfo> list2 = builder.recommend_item;
            if (list2 == null) {
                this.recommend_item = DEFAULT_RECOMMEND_ITEM;
            } else {
                this.recommend_item = Message.immutableCopyOf(list2);
            }
            List<RecommendForumInfo> list3 = builder.recommend_forum;
            if (list3 == null) {
                this.recommend_forum = DEFAULT_RECOMMEND_FORUM;
            } else {
                this.recommend_forum = Message.immutableCopyOf(list3);
            }
            String str = builder.link;
            if (str == null) {
                this.link = "";
            } else {
                this.link = str;
            }
            List<AlbumElement> list4 = builder.album_list;
            if (list4 == null) {
                this.album_list = DEFAULT_ALBUM_LIST;
            } else {
                this.album_list = Message.immutableCopyOf(list4);
            }
            List<ThreadInfo> list5 = builder.discussion_list;
            if (list5 == null) {
                this.discussion_list = DEFAULT_DISCUSSION_LIST;
            } else {
                this.discussion_list = Message.immutableCopyOf(list5);
            }
            Integer num = builder.discussion_id;
            if (num == null) {
                this.discussion_id = DEFAULT_DISCUSSION_ID;
            } else {
                this.discussion_id = num;
            }
            this.item_game_info = builder.item_game_info;
            return;
        }
        this.item_info = builder.item_info;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.recommend_item = Message.immutableCopyOf(builder.recommend_item);
        this.recommend_forum = Message.immutableCopyOf(builder.recommend_forum);
        this.link = builder.link;
        this.album_list = Message.immutableCopyOf(builder.album_list);
        this.discussion_list = Message.immutableCopyOf(builder.discussion_list);
        this.discussion_id = builder.discussion_id;
        this.item_game_info = builder.item_game_info;
    }
}
