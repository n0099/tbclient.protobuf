package tbclient.Tabfeedlist;

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
import tbclient.GeneralResource;
import tbclient.HotUserRankEntry;
import tbclient.RecommendForumInfo;
import tbclient.ThreadInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_IS_NEW_URL;
    public static final List<RecommendForumInfo> DEFAULT_RECOMMEND_FORUM_INFO;
    public static final List<GeneralResource> DEFAULT_RESOURCE_LIST;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3)
    public final HotUserRankEntry hot_userrank_entry;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<RecommendForumInfo> recommend_forum_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GeneralResource> resource_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public HotUserRankEntry hot_userrank_entry;
        public Integer is_new_url;
        public List<RecommendForumInfo> recommend_forum_info;
        public List<GeneralResource> resource_list;
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
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.resource_list = Message.copyOf(dataRes.resource_list);
            this.hot_userrank_entry = dataRes.hot_userrank_entry;
            this.recommend_forum_info = Message.copyOf(dataRes.recommend_forum_info);
            this.is_new_url = dataRes.is_new_url;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-653088531, "Ltbclient/Tabfeedlist/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-653088531, "Ltbclient/Tabfeedlist/DataRes;");
                return;
            }
        }
        DEFAULT_THREAD_LIST = Collections.emptyList();
        DEFAULT_RESOURCE_LIST = Collections.emptyList();
        DEFAULT_RECOMMEND_FORUM_INFO = Collections.emptyList();
        DEFAULT_IS_NEW_URL = 0;
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
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            List<GeneralResource> list2 = builder.resource_list;
            if (list2 == null) {
                this.resource_list = DEFAULT_RESOURCE_LIST;
            } else {
                this.resource_list = Message.immutableCopyOf(list2);
            }
            this.hot_userrank_entry = builder.hot_userrank_entry;
            List<RecommendForumInfo> list3 = builder.recommend_forum_info;
            if (list3 == null) {
                this.recommend_forum_info = DEFAULT_RECOMMEND_FORUM_INFO;
            } else {
                this.recommend_forum_info = Message.immutableCopyOf(list3);
            }
            Integer num = builder.is_new_url;
            if (num == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
                return;
            } else {
                this.is_new_url = num;
                return;
            }
        }
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.resource_list = Message.immutableCopyOf(builder.resource_list);
        this.hot_userrank_entry = builder.hot_userrank_entry;
        this.recommend_forum_info = Message.immutableCopyOf(builder.recommend_forum_info);
        this.is_new_url = builder.is_new_url;
    }
}
