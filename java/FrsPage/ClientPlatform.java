package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ClientPlatform extends Message {
    public static final String DEFAULT_SCHEDULE_CAL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String schedule_cal;
    @ProtoField(tag = 2)
    public final StarSchedule star_schedule;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ClientPlatform> {
        public String schedule_cal;
        public StarSchedule star_schedule;

        public Builder() {
        }

        public Builder(ClientPlatform clientPlatform) {
            super(clientPlatform);
            if (clientPlatform == null) {
                return;
            }
            this.schedule_cal = clientPlatform.schedule_cal;
            this.star_schedule = clientPlatform.star_schedule;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ClientPlatform build(boolean z) {
            return new ClientPlatform(this, z);
        }
    }

    public ClientPlatform(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.schedule_cal;
            if (str == null) {
                this.schedule_cal = "";
            } else {
                this.schedule_cal = str;
            }
            this.star_schedule = builder.star_schedule;
            return;
        }
        this.schedule_cal = builder.schedule_cal;
        this.star_schedule = builder.star_schedule;
    }
}
