package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class Ticket extends Message {
    public static final Integer DEFAULT_TIME = 0;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<Ticket> {
        public Integer time;
        public String url;

        public Builder() {
        }

        public Builder(Ticket ticket) {
            super(ticket);
            if (ticket == null) {
                return;
            }
            this.time = ticket.time;
            this.url = ticket.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Ticket build(boolean z) {
            return new Ticket(this, z);
        }
    }

    public Ticket(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.time;
            if (num == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
                return;
            } else {
                this.url = str;
                return;
            }
        }
        this.time = builder.time;
        this.url = builder.url;
    }
}
