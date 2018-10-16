package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class Ticket extends Message {
    public static final Integer DEFAULT_TIME = 0;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private Ticket(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.time = builder.time;
        this.url = builder.url;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<Ticket> {
        public Integer time;
        public String url;

        public Builder() {
        }

        public Builder(Ticket ticket) {
            super(ticket);
            if (ticket != null) {
                this.time = ticket.time;
                this.url = ticket.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Ticket build(boolean z) {
            return new Ticket(this, z);
        }
    }
}
