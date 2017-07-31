package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class UcCard extends Message {
    public static final String DEFAULT_DOC = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_JMP = "";
    public static final String DEFAULT_NAME = "";
    public static final List<UcCardInfo> DEFAULT_UC_CARDS = Collections.emptyList();
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String doc;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jmp;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<UcCardInfo> uc_cards;

    private UcCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.doc == null) {
                this.doc = "";
            } else {
                this.doc = builder.doc;
            }
            if (builder.jmp == null) {
                this.jmp = "";
            } else {
                this.jmp = builder.jmp;
            }
            if (builder.uc_cards == null) {
                this.uc_cards = DEFAULT_UC_CARDS;
                return;
            } else {
                this.uc_cards = immutableCopyOf(builder.uc_cards);
                return;
            }
        }
        this.name = builder.name;
        this.icon = builder.icon;
        this.doc = builder.doc;
        this.jmp = builder.jmp;
        this.uc_cards = immutableCopyOf(builder.uc_cards);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<UcCard> {
        public String doc;
        public String icon;
        public String jmp;
        public String name;
        public List<UcCardInfo> uc_cards;

        public Builder() {
        }

        public Builder(UcCard ucCard) {
            super(ucCard);
            if (ucCard != null) {
                this.name = ucCard.name;
                this.icon = ucCard.icon;
                this.doc = ucCard.doc;
                this.jmp = ucCard.jmp;
                this.uc_cards = UcCard.copyOf(ucCard.uc_cards);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UcCard build(boolean z) {
            return new UcCard(this, z);
        }
    }
}
