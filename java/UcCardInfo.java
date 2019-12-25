package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class UcCardInfo extends Message {
    public static final String DEFAULT_JMP = "";
    public static final String DEFAULT_PIC = "";
    public static final Integer DEFAULT_ST = 0;
    public static final String DEFAULT_TIP = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jmp;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer st;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tip;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    private UcCardInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.pic == null) {
                this.pic = "";
            } else {
                this.pic = builder.pic;
            }
            if (builder.jmp == null) {
                this.jmp = "";
            } else {
                this.jmp = builder.jmp;
            }
            if (builder.tip == null) {
                this.tip = "";
            } else {
                this.tip = builder.tip;
            }
            if (builder.st == null) {
                this.st = DEFAULT_ST;
                return;
            } else {
                this.st = builder.st;
                return;
            }
        }
        this.title = builder.title;
        this.pic = builder.pic;
        this.jmp = builder.jmp;
        this.tip = builder.tip;
        this.st = builder.st;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<UcCardInfo> {
        public String jmp;
        public String pic;
        public Integer st;
        public String tip;
        public String title;

        public Builder() {
        }

        public Builder(UcCardInfo ucCardInfo) {
            super(ucCardInfo);
            if (ucCardInfo != null) {
                this.title = ucCardInfo.title;
                this.pic = ucCardInfo.pic;
                this.jmp = ucCardInfo.jmp;
                this.tip = ucCardInfo.tip;
                this.st = ucCardInfo.st;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UcCardInfo build(boolean z) {
            return new UcCardInfo(this, z);
        }
    }
}
