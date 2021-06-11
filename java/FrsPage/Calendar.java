package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class Calendar extends Message {
    public static final Integer DEFAULT_D = 0;
    public static final Integer DEFAULT_RANK = 0;
    public static final Integer DEFAULT_SIGN_TYPE = 0;
    public static final String DEFAULT_T = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)

    /* renamed from: d  reason: collision with root package name */
    public final Integer f72610d;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rank;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer sign_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String t;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<Calendar> {

        /* renamed from: d  reason: collision with root package name */
        public Integer f72611d;
        public Integer rank;
        public Integer sign_type;
        public String t;

        public Builder() {
        }

        public Builder(Calendar calendar) {
            super(calendar);
            if (calendar == null) {
                return;
            }
            this.f72611d = calendar.f72610d;
            this.t = calendar.t;
            this.rank = calendar.rank;
            this.sign_type = calendar.sign_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Calendar build(boolean z) {
            return new Calendar(this, z);
        }
    }

    public Calendar(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.f72611d;
            if (num == null) {
                this.f72610d = DEFAULT_D;
            } else {
                this.f72610d = num;
            }
            String str = builder.t;
            if (str == null) {
                this.t = "";
            } else {
                this.t = str;
            }
            Integer num2 = builder.rank;
            if (num2 == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = num2;
            }
            Integer num3 = builder.sign_type;
            if (num3 == null) {
                this.sign_type = DEFAULT_SIGN_TYPE;
                return;
            } else {
                this.sign_type = num3;
                return;
            }
        }
        this.f72610d = builder.f72611d;
        this.t = builder.t;
        this.rank = builder.rank;
        this.sign_type = builder.sign_type;
    }
}
