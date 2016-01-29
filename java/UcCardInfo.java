package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class UcCardInfo extends Message {
    public static final String DEFAULT_JMP = "";
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_TIP = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jmp;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tip;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* synthetic */ UcCardInfo(Builder builder, boolean z, UcCardInfo ucCardInfo) {
        this(builder, z);
    }

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
                return;
            } else {
                this.tip = builder.tip;
                return;
            }
        }
        this.title = builder.title;
        this.pic = builder.pic;
        this.jmp = builder.jmp;
        this.tip = builder.tip;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<UcCardInfo> {
        public String jmp;
        public String pic;
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UcCardInfo build(boolean z) {
            return new UcCardInfo(this, z, null);
        }
    }
}
