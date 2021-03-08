package tbclient.LiveSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Banner;
import tbclient.Entry;
import tbclient.ThreadInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
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
    public static final List<Banner> DEFAULT_BANNER = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_LIVE = Collections.emptyList();
    public static final List<Entry> DEFAULT_ENTRY = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_INTERVAL = 0;
    public static final List<HotLiveWithCategory> DEFAULT_LIVE_WITH_CATEGORY = Collections.emptyList();
    public static final List<FunctionListInfo> DEFAULT_FUNCTION_LIST_INFO = Collections.emptyList();
    public static final Integer DEFAULT_IS_SMALL_FOLLOW = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.banner == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = immutableCopyOf(builder.banner);
            }
            if (builder.live == null) {
                this.live = DEFAULT_LIVE;
            } else {
                this.live = immutableCopyOf(builder.live);
            }
            if (builder.entry == null) {
                this.entry = DEFAULT_ENTRY;
            } else {
                this.entry = immutableCopyOf(builder.entry);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.interval == null) {
                this.interval = DEFAULT_INTERVAL;
            } else {
                this.interval = builder.interval;
            }
            if (builder.live_with_category == null) {
                this.live_with_category = DEFAULT_LIVE_WITH_CATEGORY;
            } else {
                this.live_with_category = immutableCopyOf(builder.live_with_category);
            }
            this.head_live_info = builder.head_live_info;
            if (builder.function_list_info == null) {
                this.function_list_info = DEFAULT_FUNCTION_LIST_INFO;
            } else {
                this.function_list_info = immutableCopyOf(builder.function_list_info);
            }
            if (builder.is_small_follow == null) {
                this.is_small_follow = DEFAULT_IS_SMALL_FOLLOW;
                return;
            } else {
                this.is_small_follow = builder.is_small_follow;
                return;
            }
        }
        this.banner = immutableCopyOf(builder.banner);
        this.live = immutableCopyOf(builder.live);
        this.entry = immutableCopyOf(builder.entry);
        this.has_more = builder.has_more;
        this.interval = builder.interval;
        this.live_with_category = immutableCopyOf(builder.live_with_category);
        this.head_live_info = builder.head_live_info;
        this.function_list_info = immutableCopyOf(builder.function_list_info);
        this.is_small_follow = builder.is_small_follow;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
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
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.banner = DataRes.copyOf(dataRes.banner);
                this.live = DataRes.copyOf(dataRes.live);
                this.entry = DataRes.copyOf(dataRes.entry);
                this.has_more = dataRes.has_more;
                this.interval = dataRes.interval;
                this.live_with_category = DataRes.copyOf(dataRes.live_with_category);
                this.head_live_info = dataRes.head_live_info;
                this.function_list_info = DataRes.copyOf(dataRes.function_list_info);
                this.is_small_follow = dataRes.is_small_follow;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
