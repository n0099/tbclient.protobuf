package tbclient.SearchSug;

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
import tbclient.Item;
import tbclient.RecommendForumInfo;
import tbclient.SugLiveInfo;
import tbclient.SugRankingInfo;
/* loaded from: classes3.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<tbclient.ForumInfo> DEFAULT_FORUM_LIST;
    public static final Integer DEFAULT_FORUM_LOC;
    public static final List<String> DEFAULT_LIST;
    public static final List<SugLiveInfo> DEFAULT_LIVE_CARD;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4)
    public final RecommendForumInfo forum_card;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<tbclient.ForumInfo> forum_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer forum_loc;
    @ProtoField(tag = 5)
    public final Item item_card;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> list;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<SugLiveInfo> live_card;
    @ProtoField(tag = 7)
    public final SugRankingInfo ranking_card;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public RecommendForumInfo forum_card;
        public List<tbclient.ForumInfo> forum_list;
        public Integer forum_loc;
        public Item item_card;
        public List<String> list;
        public List<SugLiveInfo> live_card;
        public SugRankingInfo ranking_card;

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
            this.forum_loc = dataRes.forum_loc;
            this.list = Message.copyOf(dataRes.list);
            this.forum_list = Message.copyOf(dataRes.forum_list);
            this.forum_card = dataRes.forum_card;
            this.item_card = dataRes.item_card;
            this.live_card = Message.copyOf(dataRes.live_card);
            this.ranking_card = dataRes.ranking_card;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(29691713, "Ltbclient/SearchSug/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(29691713, "Ltbclient/SearchSug/DataRes;");
                return;
            }
        }
        DEFAULT_FORUM_LOC = 0;
        DEFAULT_LIST = Collections.emptyList();
        DEFAULT_FORUM_LIST = Collections.emptyList();
        DEFAULT_LIVE_CARD = Collections.emptyList();
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
            Integer num = builder.forum_loc;
            if (num == null) {
                this.forum_loc = DEFAULT_FORUM_LOC;
            } else {
                this.forum_loc = num;
            }
            List<String> list = builder.list;
            if (list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = Message.immutableCopyOf(list);
            }
            List<tbclient.ForumInfo> list2 = builder.forum_list;
            if (list2 == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = Message.immutableCopyOf(list2);
            }
            this.forum_card = builder.forum_card;
            this.item_card = builder.item_card;
            List<SugLiveInfo> list3 = builder.live_card;
            if (list3 == null) {
                this.live_card = DEFAULT_LIVE_CARD;
            } else {
                this.live_card = Message.immutableCopyOf(list3);
            }
            this.ranking_card = builder.ranking_card;
            return;
        }
        this.forum_loc = builder.forum_loc;
        this.list = Message.immutableCopyOf(builder.list);
        this.forum_list = Message.immutableCopyOf(builder.forum_list);
        this.forum_card = builder.forum_card;
        this.item_card = builder.item_card;
        this.live_card = Message.immutableCopyOf(builder.live_card);
        this.ranking_card = builder.ranking_card;
    }
}
