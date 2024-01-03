package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FeedHeadButton extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedKV> business_info;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedHeadButton> {
        public List<FeedKV> business_info;
        public Integer type;

        public Builder() {
        }

        public Builder(FeedHeadButton feedHeadButton) {
            super(feedHeadButton);
            if (feedHeadButton == null) {
                return;
            }
            this.type = feedHeadButton.type;
            this.business_info = Message.copyOf(feedHeadButton.business_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedHeadButton build(boolean z) {
            return new FeedHeadButton(this, z);
        }
    }

    public FeedHeadButton(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            List<FeedKV> list = builder.business_info;
            if (list == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
                return;
            } else {
                this.business_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.type = builder.type;
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}
