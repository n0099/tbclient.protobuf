package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<EverydayThread> everyday_thread;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FineBanner> fine_banner;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<Hot_Thread> hot_thread;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
    public final List<String> tag_list;
    public static final List<FineBanner> DEFAULT_FINE_BANNER = Collections.emptyList();
    public static final List<EverydayThread> DEFAULT_EVERYDAY_THREAD = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final List<String> DEFAULT_TAG_LIST = Collections.emptyList();
    public static final List<Hot_Thread> DEFAULT_HOT_THREAD = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.fine_banner == null) {
                this.fine_banner = DEFAULT_FINE_BANNER;
            } else {
                this.fine_banner = immutableCopyOf(builder.fine_banner);
            }
            if (builder.everyday_thread == null) {
                this.everyday_thread = DEFAULT_EVERYDAY_THREAD;
            } else {
                this.everyday_thread = immutableCopyOf(builder.everyday_thread);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.tag_list == null) {
                this.tag_list = DEFAULT_TAG_LIST;
            } else {
                this.tag_list = immutableCopyOf(builder.tag_list);
            }
            if (builder.hot_thread == null) {
                this.hot_thread = DEFAULT_HOT_THREAD;
                return;
            } else {
                this.hot_thread = immutableCopyOf(builder.hot_thread);
                return;
            }
        }
        this.fine_banner = immutableCopyOf(builder.fine_banner);
        this.everyday_thread = immutableCopyOf(builder.everyday_thread);
        this.has_more = builder.has_more;
        this.tag_list = immutableCopyOf(builder.tag_list);
        this.hot_thread = immutableCopyOf(builder.hot_thread);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<EverydayThread> everyday_thread;
        public List<FineBanner> fine_banner;
        public Integer has_more;
        public List<Hot_Thread> hot_thread;
        public List<String> tag_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.fine_banner = DataRes.copyOf(dataRes.fine_banner);
                this.everyday_thread = DataRes.copyOf(dataRes.everyday_thread);
                this.has_more = dataRes.has_more;
                this.tag_list = DataRes.copyOf(dataRes.tag_list);
                this.hot_thread = DataRes.copyOf(dataRes.hot_thread);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
