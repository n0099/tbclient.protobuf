package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Kpi extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_KPI1 = "";
    public static final String DEFAULT_KPI10 = "";
    public static final String DEFAULT_KPI11 = "";
    public static final String DEFAULT_KPI12 = "";
    public static final String DEFAULT_KPI2 = "";
    public static final String DEFAULT_KPI3 = "";
    public static final String DEFAULT_KPI4 = "";
    public static final String DEFAULT_KPI5 = "";
    public static final String DEFAULT_KPI6 = "";
    public static final String DEFAULT_KPI7 = "";
    public static final String DEFAULT_KPI8 = "";
    public static final String DEFAULT_KPI9 = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String kpi1;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String kpi10;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String kpi11;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String kpi12;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String kpi2;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String kpi3;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String kpi4;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String kpi5;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String kpi6;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String kpi7;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String kpi8;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String kpi9;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String kpi1;
        public String kpi10;
        public String kpi11;
        public String kpi12;
        public String kpi2;
        public String kpi3;
        public String kpi4;
        public String kpi5;
        public String kpi6;
        public String kpi7;
        public String kpi8;
        public String kpi9;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Kpi kpi) {
            super(kpi);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {kpi};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (kpi == null) {
                return;
            }
            this.kpi1 = kpi.kpi1;
            this.kpi2 = kpi.kpi2;
            this.kpi3 = kpi.kpi3;
            this.kpi4 = kpi.kpi4;
            this.kpi5 = kpi.kpi5;
            this.kpi6 = kpi.kpi6;
            this.kpi7 = kpi.kpi7;
            this.kpi8 = kpi.kpi8;
            this.kpi9 = kpi.kpi9;
            this.kpi10 = kpi.kpi10;
            this.kpi11 = kpi.kpi11;
            this.kpi12 = kpi.kpi12;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Kpi build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Kpi(this, z, null);
            }
            return (Kpi) invokeZ.objValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kpi(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.kpi1;
            if (str == null) {
                this.kpi1 = "";
            } else {
                this.kpi1 = str;
            }
            String str2 = builder.kpi2;
            if (str2 == null) {
                this.kpi2 = "";
            } else {
                this.kpi2 = str2;
            }
            String str3 = builder.kpi3;
            if (str3 == null) {
                this.kpi3 = "";
            } else {
                this.kpi3 = str3;
            }
            String str4 = builder.kpi4;
            if (str4 == null) {
                this.kpi4 = "";
            } else {
                this.kpi4 = str4;
            }
            String str5 = builder.kpi5;
            if (str5 == null) {
                this.kpi5 = "";
            } else {
                this.kpi5 = str5;
            }
            String str6 = builder.kpi6;
            if (str6 == null) {
                this.kpi6 = "";
            } else {
                this.kpi6 = str6;
            }
            String str7 = builder.kpi7;
            if (str7 == null) {
                this.kpi7 = "";
            } else {
                this.kpi7 = str7;
            }
            String str8 = builder.kpi8;
            if (str8 == null) {
                this.kpi8 = "";
            } else {
                this.kpi8 = str8;
            }
            String str9 = builder.kpi9;
            if (str9 == null) {
                this.kpi9 = "";
            } else {
                this.kpi9 = str9;
            }
            String str10 = builder.kpi10;
            if (str10 == null) {
                this.kpi10 = "";
            } else {
                this.kpi10 = str10;
            }
            String str11 = builder.kpi11;
            if (str11 == null) {
                this.kpi11 = "";
            } else {
                this.kpi11 = str11;
            }
            String str12 = builder.kpi12;
            if (str12 == null) {
                this.kpi12 = "";
                return;
            } else {
                this.kpi12 = str12;
                return;
            }
        }
        this.kpi1 = builder.kpi1;
        this.kpi2 = builder.kpi2;
        this.kpi3 = builder.kpi3;
        this.kpi4 = builder.kpi4;
        this.kpi5 = builder.kpi5;
        this.kpi6 = builder.kpi6;
        this.kpi7 = builder.kpi7;
        this.kpi8 = builder.kpi8;
        this.kpi9 = builder.kpi9;
        this.kpi10 = builder.kpi10;
        this.kpi11 = builder.kpi11;
        this.kpi12 = builder.kpi12;
    }

    public /* synthetic */ Kpi(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
