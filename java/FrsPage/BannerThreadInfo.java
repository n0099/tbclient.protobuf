package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;
/* loaded from: classes9.dex */
public final class BannerThreadInfo extends Message {
    public static final Integer DEFAULT_FROM = 0;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer from;
    @ProtoField(tag = 1)
    public final ThreadInfo thread_info;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BannerThreadInfo> {
        public Integer from;
        public ThreadInfo thread_info;

        public Builder() {
        }

        public Builder(BannerThreadInfo bannerThreadInfo) {
            super(bannerThreadInfo);
            if (bannerThreadInfo == null) {
                return;
            }
            this.thread_info = bannerThreadInfo.thread_info;
            this.from = bannerThreadInfo.from;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerThreadInfo build(boolean z) {
            return new BannerThreadInfo(this, z);
        }
    }

    public BannerThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.thread_info = builder.thread_info;
            Integer num = builder.from;
            if (num == null) {
                this.from = DEFAULT_FROM;
                return;
            } else {
                this.from = num;
                return;
            }
        }
        this.thread_info = builder.thread_info;
        this.from = builder.from;
    }
}
