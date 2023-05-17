package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class LevelPop extends Message {
    public static final String DEFAULT_BTN_SCHEME = "";
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_CANCEL_BTN_TEXT = "";
    public static final String DEFAULT_DESC = "";
    public static final Integer DEFAULT_LEVEL = 0;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String btn_scheme;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String cancel_btn_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer level;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LevelPop> {
        public String btn_scheme;
        public String btn_text;
        public String cancel_btn_text;
        public String desc;
        public Integer level;
        public String title;

        public Builder() {
        }

        public Builder(LevelPop levelPop) {
            super(levelPop);
            if (levelPop == null) {
                return;
            }
            this.title = levelPop.title;
            this.desc = levelPop.desc;
            this.btn_text = levelPop.btn_text;
            this.btn_scheme = levelPop.btn_scheme;
            this.level = levelPop.level;
            this.cancel_btn_text = levelPop.cancel_btn_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LevelPop build(boolean z) {
            return new LevelPop(this, z);
        }
    }

    public LevelPop(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
            } else {
                this.desc = str2;
            }
            String str3 = builder.btn_text;
            if (str3 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str3;
            }
            String str4 = builder.btn_scheme;
            if (str4 == null) {
                this.btn_scheme = "";
            } else {
                this.btn_scheme = str4;
            }
            Integer num = builder.level;
            if (num == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = num;
            }
            String str5 = builder.cancel_btn_text;
            if (str5 == null) {
                this.cancel_btn_text = "";
                return;
            } else {
                this.cancel_btn_text = str5;
                return;
            }
        }
        this.title = builder.title;
        this.desc = builder.desc;
        this.btn_text = builder.btn_text;
        this.btn_scheme = builder.btn_scheme;
        this.level = builder.level;
        this.cancel_btn_text = builder.cancel_btn_text;
    }
}
