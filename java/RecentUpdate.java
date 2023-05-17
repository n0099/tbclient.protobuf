package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class RecentUpdate extends Message {
    public static final String DEFAULT_LOG = "";
    public static final String DEFAULT_UPDATE_TIME = "";
    public static final String DEFAULT_VERSION = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String log;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String update_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String version;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RecentUpdate> {
        public String log;
        public String update_time;
        public String version;

        public Builder() {
        }

        public Builder(RecentUpdate recentUpdate) {
            super(recentUpdate);
            if (recentUpdate == null) {
                return;
            }
            this.version = recentUpdate.version;
            this.log = recentUpdate.log;
            this.update_time = recentUpdate.update_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecentUpdate build(boolean z) {
            return new RecentUpdate(this, z);
        }
    }

    public RecentUpdate(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.version;
            if (str == null) {
                this.version = "";
            } else {
                this.version = str;
            }
            String str2 = builder.log;
            if (str2 == null) {
                this.log = "";
            } else {
                this.log = str2;
            }
            String str3 = builder.update_time;
            if (str3 == null) {
                this.update_time = "";
                return;
            } else {
                this.update_time = str3;
                return;
            }
        }
        this.version = builder.version;
        this.log = builder.log;
        this.update_time = builder.update_time;
    }
}
