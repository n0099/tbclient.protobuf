package tbclient.LiveSquare;

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
import tbclient.Banner;
import tbclient.Entry;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<Banner> DEFAULT_BANNER;
    public static final List<Entry> DEFAULT_ENTRY;
    public static final List<FunctionListInfo> DEFAULT_FUNCTION_LIST_INFO;
    public static final Integer DEFAULT_HAS_MORE;
    public static final Integer DEFAULT_INTERVAL;
    public static final Integer DEFAULT_IS_SMALL_FOLLOW;
    public static final List<ThreadInfo> DEFAULT_LIVE;
    public static final List<HotLiveWithCategory> DEFAULT_LIVE_WITH_CATEGORY;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Banner> banner;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Entry> entry;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<FunctionListInfo> function_list_info;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 7)
    public final HeadLiveInfo head_live_info;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer interval;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_small_follow;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> live;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<HotLiveWithCategory> live_with_category;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<Banner> banner;
        public List<Entry> entry;
        public List<FunctionListInfo> function_list_info;
        public Integer has_more;
        public HeadLiveInfo head_live_info;
        public Integer interval;
        public Integer is_small_follow;
        public List<ThreadInfo> live;
        public List<HotLiveWithCategory> live_with_category;

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
            this.banner = Message.copyOf(dataRes.banner);
            this.live = Message.copyOf(dataRes.live);
            this.entry = Message.copyOf(dataRes.entry);
            this.has_more = dataRes.has_more;
            this.interval = dataRes.interval;
            this.live_with_category = Message.copyOf(dataRes.live_with_category);
            this.head_live_info = dataRes.head_live_info;
            this.function_list_info = Message.copyOf(dataRes.function_list_info);
            this.is_small_follow = dataRes.is_small_follow;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1827709825, "Ltbclient/LiveSquare/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1827709825, "Ltbclient/LiveSquare/DataRes;");
                return;
            }
        }
        DEFAULT_BANNER = Collections.emptyList();
        DEFAULT_LIVE = Collections.emptyList();
        DEFAULT_ENTRY = Collections.emptyList();
        DEFAULT_HAS_MORE = 0;
        DEFAULT_INTERVAL = 0;
        DEFAULT_LIVE_WITH_CATEGORY = Collections.emptyList();
        DEFAULT_FUNCTION_LIST_INFO = Collections.emptyList();
        DEFAULT_IS_SMALL_FOLLOW = 0;
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
            List<Banner> list = builder.banner;
            if (list == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = Message.immutableCopyOf(list);
            }
            List<ThreadInfo> list2 = builder.live;
            if (list2 == null) {
                this.live = DEFAULT_LIVE;
            } else {
                this.live = Message.immutableCopyOf(list2);
            }
            List<Entry> list3 = builder.entry;
            if (list3 == null) {
                this.entry = DEFAULT_ENTRY;
            } else {
                this.entry = Message.immutableCopyOf(list3);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            Integer num2 = builder.interval;
            if (num2 == null) {
                this.interval = DEFAULT_INTERVAL;
            } else {
                this.interval = num2;
            }
            List<HotLiveWithCategory> list4 = builder.live_with_category;
            if (list4 == null) {
                this.live_with_category = DEFAULT_LIVE_WITH_CATEGORY;
            } else {
                this.live_with_category = Message.immutableCopyOf(list4);
            }
            this.head_live_info = builder.head_live_info;
            List<FunctionListInfo> list5 = builder.function_list_info;
            if (list5 == null) {
                this.function_list_info = DEFAULT_FUNCTION_LIST_INFO;
            } else {
                this.function_list_info = Message.immutableCopyOf(list5);
            }
            Integer num3 = builder.is_small_follow;
            if (num3 == null) {
                this.is_small_follow = DEFAULT_IS_SMALL_FOLLOW;
                return;
            } else {
                this.is_small_follow = num3;
                return;
            }
        }
        this.banner = Message.immutableCopyOf(builder.banner);
        this.live = Message.immutableCopyOf(builder.live);
        this.entry = Message.immutableCopyOf(builder.entry);
        this.has_more = builder.has_more;
        this.interval = builder.interval;
        this.live_with_category = Message.immutableCopyOf(builder.live_with_category);
        this.head_live_info = builder.head_live_info;
        this.function_list_info = Message.immutableCopyOf(builder.function_list_info);
        this.is_small_follow = builder.is_small_follow;
    }
}
