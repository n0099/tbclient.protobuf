package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
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

    /* loaded from: classes7.dex */
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
            if (dataRes == null) {
                return;
            }
            this.fine_banner = Message.copyOf(dataRes.fine_banner);
            this.everyday_thread = Message.copyOf(dataRes.everyday_thread);
            this.has_more = dataRes.has_more;
            this.tag_list = Message.copyOf(dataRes.tag_list);
            this.hot_thread = Message.copyOf(dataRes.hot_thread);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FineBanner> list = builder.fine_banner;
            if (list == null) {
                this.fine_banner = DEFAULT_FINE_BANNER;
            } else {
                this.fine_banner = Message.immutableCopyOf(list);
            }
            List<EverydayThread> list2 = builder.everyday_thread;
            if (list2 == null) {
                this.everyday_thread = DEFAULT_EVERYDAY_THREAD;
            } else {
                this.everyday_thread = Message.immutableCopyOf(list2);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            List<String> list3 = builder.tag_list;
            if (list3 == null) {
                this.tag_list = DEFAULT_TAG_LIST;
            } else {
                this.tag_list = Message.immutableCopyOf(list3);
            }
            List<Hot_Thread> list4 = builder.hot_thread;
            if (list4 == null) {
                this.hot_thread = DEFAULT_HOT_THREAD;
                return;
            } else {
                this.hot_thread = Message.immutableCopyOf(list4);
                return;
            }
        }
        this.fine_banner = Message.immutableCopyOf(builder.fine_banner);
        this.everyday_thread = Message.immutableCopyOf(builder.everyday_thread);
        this.has_more = builder.has_more;
        this.tag_list = Message.immutableCopyOf(builder.tag_list);
        this.hot_thread = Message.immutableCopyOf(builder.hot_thread);
    }
}
