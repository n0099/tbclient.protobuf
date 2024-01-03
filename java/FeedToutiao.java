package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FeedToutiao extends Message {
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedKV> business_info;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedToutiao> {
        public List<FeedKV> business_info;

        public Builder() {
        }

        public Builder(FeedToutiao feedToutiao) {
            super(feedToutiao);
            if (feedToutiao == null) {
                return;
            }
            this.business_info = Message.copyOf(feedToutiao.business_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedToutiao build(boolean z) {
            return new FeedToutiao(this, z);
        }
    }

    public FeedToutiao(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedKV> list = builder.business_info;
            if (list == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
                return;
            } else {
                this.business_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}
