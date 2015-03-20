package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<EverydayThread> everyday_thread;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FineBanner> fine_banner;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_more;
    public static final List<FineBanner> DEFAULT_FINE_BANNER = Collections.emptyList();
    public static final List<EverydayThread> DEFAULT_EVERYDAY_THREAD = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

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
                return;
            } else {
                this.has_more = builder.has_more;
                return;
            }
        }
        this.fine_banner = immutableCopyOf(builder.fine_banner);
        this.everyday_thread = immutableCopyOf(builder.everyday_thread);
        this.has_more = builder.has_more;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public List<EverydayThread> everyday_thread;
        public List<FineBanner> fine_banner;
        public Integer has_more;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.fine_banner = DataRes.copyOf(dataRes.fine_banner);
                this.everyday_thread = DataRes.copyOf(dataRes.everyday_thread);
                this.has_more = dataRes.has_more;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
