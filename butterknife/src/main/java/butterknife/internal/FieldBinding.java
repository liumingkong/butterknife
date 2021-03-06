package butterknife.internal;

final class FieldBinding implements Binding {
  private final String name;
  private final String type;
  private final boolean required;

  FieldBinding(String name, String type, boolean required) {
    this.name = name;
    this.type = type;
    this.required = required;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  @Override public String getDescription() {
    return "field '" + name + "'";
  }

  @Override public boolean isRequired() {
    return required;
  }
}
