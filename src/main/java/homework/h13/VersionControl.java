package homework.h13;

public class VersionControl {
  private final int bad;

  public VersionControl(int bad) {
    this.bad = bad;
  }

  boolean isBadVersion(int version) {
    return version >= bad;
  }
}
