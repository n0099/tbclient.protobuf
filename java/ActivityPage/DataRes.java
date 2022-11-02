package tbclient.ActivityPage;

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
import tbclient.BannerImage;
import tbclient.Page;
import tbclient.ThreadInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<BannerImage> DEFAULT_BANNER_IMAGE;
    public static final List<BannerImage> DEFAULT_GRID;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<BannerImage> banner_image;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<BannerImage> grid;
    @ProtoField(tag = 4)
    public final HotTopic hot_topic;
    @ProtoField(tag = 8)
    public final Page page_info;
    @ProtoField(tag = 6)
    public final RecommendForumList recommend_forum;
    @ProtoField(tag = 7)
    public final RecommendUserList recommend_user;
    @ProtoField(tag = 5)
    public final SpecialColumnList special_column;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ThreadInfo> thread_list;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<BannerImage> banner_image;
        public List<BannerImage> grid;
        public HotTopic hot_topic;
        public Page page_info;
        public RecommendForumList recommend_forum;
        public RecommendUserList recommend_user;
        public SpecialColumnList special_column;
        public List<ThreadInfo> thread_list;

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
            this.banner_image = Message.copyOf(dataRes.banner_image);
            this.grid = Message.copyOf(dataRes.grid);
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.hot_topic = dataRes.hot_topic;
            this.special_column = dataRes.special_column;
            this.recommend_forum = dataRes.recommend_forum;
            this.recommend_user = dataRes.recommend_user;
            this.page_info = dataRes.page_info;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1291720844, "Ltbclient/ActivityPage/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1291720844, "Ltbclient/ActivityPage/DataRes;");
                return;
            }
        }
        DEFAULT_BANNER_IMAGE = Collections.emptyList();
        DEFAULT_GRID = Collections.emptyList();
        DEFAULT_THREAD_LIST = Collections.emptyList();
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
            List<BannerImage> list = builder.banner_image;
            if (list == null) {
                this.banner_image = DEFAULT_BANNER_IMAGE;
            } else {
                this.banner_image = Message.immutableCopyOf(list);
            }
            List<BannerImage> list2 = builder.grid;
            if (list2 == null) {
                this.grid = DEFAULT_GRID;
            } else {
                this.grid = Message.immutableCopyOf(list2);
            }
            List<ThreadInfo> list3 = builder.thread_list;
            if (list3 == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list3);
            }
            this.hot_topic = builder.hot_topic;
            this.special_column = builder.special_column;
            this.recommend_forum = builder.recommend_forum;
            this.recommend_user = builder.recommend_user;
            this.page_info = builder.page_info;
            return;
        }
        this.banner_image = Message.immutableCopyOf(builder.banner_image);
        this.grid = Message.immutableCopyOf(builder.grid);
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.hot_topic = builder.hot_topic;
        this.special_column = builder.special_column;
        this.recommend_forum = builder.recommend_forum;
        this.recommend_user = builder.recommend_user;
        this.page_info = builder.page_info;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
