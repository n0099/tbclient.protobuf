package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class LiveCoverStatus extends Message {
    public static final String DEFAULT_STATUS = "";
    public static final Integer DEFAULT_STATUS_NUM = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String status;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer status_num;

    private LiveCoverStatus(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.status_num == null) {
                this.status_num = DEFAULT_STATUS_NUM;
            } else {
                this.status_num = builder.status_num;
            }
            if (builder.status == null) {
                this.status = "";
                return;
            } else {
                this.status = builder.status;
                return;
            }
        }
        this.status_num = builder.status_num;
        this.status = builder.status;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<LiveCoverStatus> {
        public String status;
        public Integer status_num;

        public Builder() {
        }

        public Builder(LiveCoverStatus liveCoverStatus) {
            super(liveCoverStatus);
            if (liveCoverStatus != null) {
                this.status_num = liveCoverStatus.status_num;
                this.status = liveCoverStatus.status;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveCoverStatus build(boolean z) {
            return new LiveCoverStatus(this, z);
        }
    }
}
