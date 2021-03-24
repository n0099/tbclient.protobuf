package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    /* loaded from: classes7.dex */
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
            if (ucCardInfo == null) {
                return;
            }
            this.title = ucCardInfo.title;
            this.pic = ucCardInfo.pic;
            this.jmp = ucCardInfo.jmp;
            this.tip = ucCardInfo.tip;
            this.st = ucCardInfo.st;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UcCardInfo build(boolean z) {
            return new UcCardInfo(this, z);
        }
    }

    public UcCardInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.pic;
            if (str2 == null) {
                this.pic = "";
            } else {
                this.pic = str2;
            }
            String str3 = builder.jmp;
            if (str3 == null) {
                this.jmp = "";
            } else {
                this.jmp = str3;
            }
            String str4 = builder.tip;
            if (str4 == null) {
                this.tip = "";
            } else {
                this.tip = str4;
            }
            Integer num = builder.st;
            if (num == null) {
                this.st = DEFAULT_ST;
                return;
            } else {
                this.st = num;
                return;
            }
        }
        this.title = builder.title;
        this.pic = builder.pic;
        this.jmp = builder.jmp;
        this.tip = builder.tip;
        this.st = builder.st;
    }
}
