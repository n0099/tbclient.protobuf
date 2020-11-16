package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class ClientPlatform extends Message {
    public static final String DEFAULT_SCHEDULE_CAL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String schedule_cal;
    @ProtoField(tag = 2)
    public final StarSchedule star_schedule;

    private ClientPlatform(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.schedule_cal == null) {
                this.schedule_cal = "";
            } else {
                this.schedule_cal = builder.schedule_cal;
            }
            this.star_schedule = builder.star_schedule;
            return;
        }
        this.schedule_cal = builder.schedule_cal;
        this.star_schedule = builder.star_schedule;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<ClientPlatform> {
        public String schedule_cal;
        public StarSchedule star_schedule;

        public Builder() {
        }

        public Builder(ClientPlatform clientPlatform) {
            super(clientPlatform);
            if (clientPlatform != null) {
                this.schedule_cal = clientPlatform.schedule_cal;
                this.star_schedule = clientPlatform.star_schedule;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ClientPlatform build(boolean z) {
            return new ClientPlatform(this, z);
        }
    }
}
