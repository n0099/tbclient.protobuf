package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Error extends Message {
    public static final String DEFAULT_ERRMSG = "";
    public static final Integer DEFAULT_ERRORNO = 0;
    public static final String DEFAULT_USERMSG = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String errmsg;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer errorno;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String usermsg;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Error> {
        public String errmsg;
        public Integer errorno;
        public String usermsg;

        public Builder() {
        }

        public Builder(Error error) {
            super(error);
            if (error == null) {
                return;
            }
            this.errorno = error.errorno;
            this.errmsg = error.errmsg;
            this.usermsg = error.usermsg;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Error build(boolean z) {
            return new Error(this, z);
        }
    }

    public Error(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.errorno;
            if (num == null) {
                this.errorno = DEFAULT_ERRORNO;
            } else {
                this.errorno = num;
            }
            String str = builder.errmsg;
            if (str == null) {
                this.errmsg = "";
            } else {
                this.errmsg = str;
            }
            String str2 = builder.usermsg;
            if (str2 == null) {
                this.usermsg = "";
                return;
            } else {
                this.usermsg = str2;
                return;
            }
        }
        this.errorno = builder.errorno;
        this.errmsg = builder.errmsg;
        this.usermsg = builder.usermsg;
    }
}
