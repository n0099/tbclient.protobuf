package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Calendar extends Message {
    public static final Integer DEFAULT_D = 0;
    public static final Integer DEFAULT_RANK = 0;
    public static final Integer DEFAULT_SIGN_TYPE = 0;
    public static final String DEFAULT_T = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer d;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rank;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer sign_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String t;

    private Calendar(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.d == null) {
                this.d = DEFAULT_D;
            } else {
                this.d = builder.d;
            }
            if (builder.t == null) {
                this.t = "";
            } else {
                this.t = builder.t;
            }
            if (builder.rank == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = builder.rank;
            }
            if (builder.sign_type == null) {
                this.sign_type = DEFAULT_SIGN_TYPE;
                return;
            } else {
                this.sign_type = builder.sign_type;
                return;
            }
        }
        this.d = builder.d;
        this.t = builder.t;
        this.rank = builder.rank;
        this.sign_type = builder.sign_type;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Calendar> {
        public Integer d;
        public Integer rank;
        public Integer sign_type;
        public String t;

        public Builder() {
        }

        public Builder(Calendar calendar) {
            super(calendar);
            if (calendar != null) {
                this.d = calendar.d;
                this.t = calendar.t;
                this.rank = calendar.rank;
                this.sign_type = calendar.sign_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Calendar build(boolean z) {
            return new Calendar(this, z);
        }
    }
}
