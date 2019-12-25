package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public final class Esport extends Message {
    @ProtoField(tag = 1)
    public final EsportStatic _static;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<EsportRank> billboard;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer floor_no;
    public static final Integer DEFAULT_FLOOR_NO = 0;
    public static final List<EsportRank> DEFAULT_BILLBOARD = Collections.emptyList();

    private Esport(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this._static = builder._static;
            if (builder.floor_no == null) {
                this.floor_no = DEFAULT_FLOOR_NO;
            } else {
                this.floor_no = builder.floor_no;
            }
            if (builder.billboard == null) {
                this.billboard = DEFAULT_BILLBOARD;
                return;
            } else {
                this.billboard = immutableCopyOf(builder.billboard);
                return;
            }
        }
        this._static = builder._static;
        this.floor_no = builder.floor_no;
        this.billboard = immutableCopyOf(builder.billboard);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<Esport> {
        public EsportStatic _static;
        public List<EsportRank> billboard;
        public Integer floor_no;

        public Builder() {
        }

        public Builder(Esport esport) {
            super(esport);
            if (esport != null) {
                this._static = esport._static;
                this.floor_no = esport.floor_no;
                this.billboard = Esport.copyOf(esport.billboard);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Esport build(boolean z) {
            return new Esport(this, z);
        }
    }
}
